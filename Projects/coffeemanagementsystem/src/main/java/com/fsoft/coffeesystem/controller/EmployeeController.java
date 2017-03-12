package com.fsoft.coffeesystem.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.model.EmployeeModel;
import com.fsoft.coffeesystem.model.SearchEmployeeModel;
import com.fsoft.coffeesystem.service.EmployeeService;

@RestController
@RequestMapping("/")
public class EmployeeController {
	static final Logger log = Logger.getLogger(EmployeeController.class.getName());
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/homeAddEmployees")
	public ModelAndView homeAddEmployee() {
		return new ModelAndView("addEmployees");
	}

	@RequestMapping(value = "/addEmployees", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addEmployees(@RequestBody EmployeeModel employeeModel){
		try {
			employeeService.addEmployees(employeeModel);
			return true;
		} catch (Exception e) {
			log.log(Level.INFO, e.getMessage(), e);
			return false;
		}
	}
	@RequestMapping(value="/employee")
	public ModelAndView initEmployee() {
		return new ModelAndView("listemployee");
	}
	@RequestMapping(value="/searchemployee")
	public List<EmployeeModel> searchEmployee(@RequestBody SearchEmployeeModel employeeModel) {
		List<EmployeeModel> employeeModels= employeeService.searchEmployee(employeeModel);
		return employeeModels;
	}}
