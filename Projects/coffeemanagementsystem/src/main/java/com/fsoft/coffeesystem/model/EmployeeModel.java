package com.fsoft.coffeesystem.model;

import java.math.BigDecimal;
import java.util.Date;

public class EmployeeModel{
	
	private int id;	
	private int wardId;	
	private String name;	
	private String address;	
	private String idCard;	
	private String phone;	
	private Date birthday;	
	private Date startDate;	
	private Date endDate;	
	private BigDecimal salary;	
	private String position;	
	private boolean gender;	
	private String description;
	
	public EmployeeModel() {
		super();
	}

	
	public EmployeeModel(int id, int wardId, String name, String address, String idCard, String phone, Date birthday,
			Date startDate, Date endDate, BigDecimal salary, String position, boolean gender, String description) {
		super();
		this.id = id;
		this.wardId = wardId;
		this.name = name;
		this.address = address;
		this.idCard = idCard;
		this.phone = phone;
		this.birthday = birthday;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salary = salary;
		this.position = position;
		this.gender = gender;
		this.description = description;
	}

	public EmployeeModel(int wardId, String name, String address, String idCard, String phone, Date birthday,
			Date startDate, Date endDate, BigDecimal salary, String position, boolean gender, String description) {
		super();
		this.wardId = wardId;
		this.name = name;
		this.address = address;
		this.idCard = idCard;
		this.phone = phone;
		this.birthday = birthday;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salary = salary;
		this.position = position;
		this.gender = gender;
		this.description = description;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getWardId() {
		return wardId;
	}


	public void setWardId(int wardId) {
		this.wardId = wardId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getIdCard() {
		return idCard;
	}


	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public BigDecimal getSalary() {
		return salary;
	}


	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public boolean isGender() {
		return gender;
	}


	public void setGender(boolean gender) {
		this.gender = gender;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
