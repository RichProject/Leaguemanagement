package com.fsoft.coffeesystem.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.EmployeeDao;
import com.fsoft.coffeesystem.dao.WardDao;
import com.fsoft.coffeesystem.entity.Employee;
import com.fsoft.coffeesystem.entity.Ward;
import com.fsoft.coffeesystem.model.EmployeeModel;
import com.fsoft.coffeesystem.model.SearchEmployeeModel;
import com.fsoft.coffeesystem.utilites.ValidateEmployee;
@Service("employeeService")
public class EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
@Autowired
	private WardDao wardDao;
	
	public void addEmployees(EmployeeModel employeeModel){
		Employee emp = new Employee();
		emp.setName(employeeModel.getName());
		emp.setAddress(employeeModel.getAddress());
		emp.setBirthday(employeeModel.getBirthday());
		emp.setDescription(employeeModel.getDescription());
		emp.setEndDate(employeeModel.getEndDate());
		emp.setGender(employeeModel.isGender());
		emp.setIdCard(employeeModel.getIdCard());
		emp.setPhone(employeeModel.getPhone());
		emp.setPosition(employeeModel.getPosition());
		emp.setSalary(employeeModel.getSalary());
		emp.setStartDate(employeeModel.getStartDate());
		Ward wardId = wardDao.findOne(employeeModel.getWardId());
		emp.setWard(wardId);
		employeeDao.save(emp);
	}
	public List<EmployeeModel> searchEmployee(SearchEmployeeModel employeeModel) {
		List<EmployeeModel> listEmployee = new ArrayList<EmployeeModel>();
		employeeModel.setMinSalary(employeeModel.getMinSalary().replaceAll(",", "").isEmpty() ? "0"
				: employeeModel.getMinSalary().replaceAll(",", ""));
		employeeModel.setMaxSalary(employeeModel.getMaxSalary().replaceAll(",", "").isEmpty() ? "0"
				: employeeModel.getMaxSalary().replaceAll(",", ""));
		if (employeeModel.getCity().equalsIgnoreCase("rong")) {
			listEmployee = searchEmployeeNormal(employeeModel);
		} else if (employeeModel.getDistrict().equalsIgnoreCase("rong")) {
			listEmployee = searchEmployeeWithCity(employeeModel);
		} else if (employeeModel.getWard().equalsIgnoreCase("rong")) {
			listEmployee = searchEmployeeWithDistrict(employeeModel);
		} else {
			listEmployee = searchEmployeeWithWard(employeeModel);
		}
		return listEmployee;
	}

	private List<EmployeeModel> searchEmployeeWithWard(SearchEmployeeModel employeeModel) {
		List<Employee> listEmployee = employeeDao.searchFromWard(employeeModel.getName(), employeeModel.getAddress(),
				employeeModel.getIdCard(), employeeModel.getPhone(), employeeModel.getPosition(),
				new BigDecimal(employeeModel.getMinSalary()), new BigDecimal(employeeModel.getMaxSalary()),
				employeeModel.getWard());
		List<EmployeeModel> employeeResult = searchGeneral(listEmployee, employeeModel);
		return employeeResult;
	}

	private List<EmployeeModel> searchEmployeeWithDistrict(SearchEmployeeModel employeeModel) {
		List<Employee> listEmployee = employeeDao.searchFromDistrict(employeeModel.getName(), employeeModel.getAddress(),
				employeeModel.getIdCard(), employeeModel.getPhone(), employeeModel.getPosition(),
				new BigDecimal(employeeModel.getMinSalary()), new BigDecimal(employeeModel.getMaxSalary()),
				employeeModel.getDistrict());
		List<EmployeeModel> employeeResult = searchGeneral(listEmployee, employeeModel);
		return employeeResult;
	}

	private List<EmployeeModel> searchEmployeeWithCity(SearchEmployeeModel employeeModel) {
		List<Employee> listEmployee = employeeDao.searchFromCity(employeeModel.getName(), employeeModel.getAddress(),
				employeeModel.getIdCard(), employeeModel.getPhone(), employeeModel.getPosition(),
				new BigDecimal(employeeModel.getMinSalary().replaceAll(",", "").isEmpty() ? "0"
						: employeeModel.getMinSalary().replaceAll(",", "")),
				new BigDecimal(employeeModel.getMaxSalary().replaceAll(",", "").isEmpty() ? "0"
						: employeeModel.getMaxSalary().replaceAll(",", "")),
				employeeModel.getCity());
		List<EmployeeModel> employeeResult = searchGeneral(listEmployee, employeeModel);
		return employeeResult;
	}

	private List<EmployeeModel> searchEmployeeNormal(SearchEmployeeModel employeeModel) {
		List<Employee> listEmployee = employeeDao.searchNormal(employeeModel.getName(), employeeModel.getAddress(),
				employeeModel.getIdCard(), employeeModel.getPhone(), employeeModel.getPosition(),
				new BigDecimal(employeeModel.getMinSalary().replaceAll(",", "").isEmpty() ? "0"
						: employeeModel.getMinSalary().replaceAll(",", "")),
				new BigDecimal(employeeModel.getMaxSalary().replaceAll(",", "").isEmpty() ? "0"
						: employeeModel.getMaxSalary().replaceAll(",", "")));
		List<EmployeeModel> employeeResult = searchGeneral(listEmployee, employeeModel);
		return employeeResult;
	}

	private List<EmployeeModel> searchGeneral(List<Employee> listEmployee, SearchEmployeeModel employeeModel) {
		List<EmployeeModel> employeeResult = new ArrayList<>();
		Boolean gender = null;
		if (!employeeModel.getGender().equalsIgnoreCase("rong")) {
			gender = new Boolean(employeeModel.getGender());
		}
		for (Employee employee : listEmployee) {
			if (ValidateEmployee.checkGender(gender, employee.isGender())
					&& ValidateEmployee.checkBirthday(employee.getBirthday(), employeeModel.getBirthday(),
							employeeModel.getBirthmonth(), employeeModel.getBirthyear())
					&& ValidateEmployee.checkStartEndDate(employee.getStartDate(), employee.getEndDate(),
							employeeModel.getStartDate(), employeeModel.getEndDate())) {
				employeeResult.add(ValidateEmployee.convertToModel(employee));
			}
		}
		return employeeResult;
	}
}
