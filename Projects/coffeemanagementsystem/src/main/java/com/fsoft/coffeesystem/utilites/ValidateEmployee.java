package com.fsoft.coffeesystem.utilites;

import java.util.Date;

import com.fsoft.coffeesystem.entity.Employee;
import com.fsoft.coffeesystem.model.EmployeeModel;

public class ValidateEmployee {
	public static boolean checkStartEndDate(Date startDate, Date endDate, String startDate2, String endDate2) {
		return false;
	}

	public static boolean checkBirthday(Date birthday, String birthday2, String birthmonth, String birthyear) {
		
		return false;
	}

	public static boolean checkGender(Boolean gender, boolean employeeGender) {
		if (gender == null) {
			return true;
		}
		if (gender == employeeGender) {
			return true;
		}
		return false;
	}

	public static EmployeeModel convertToModel(Employee employee) {
		return null;
	}
}
