package com.fsoft.coffeesystem.model;

public class SearchEmployeeModel {
	String name;
	String address;
	String idCard;
	String phone;
	String minSalary;
	String maxSalary;
	String position;
	String gender;
	String ward;
	String district;
	String city;
	String birthday;
	String birthmonth;
	String birthyear;
	String startDate;
	String endDate;
	public SearchEmployeeModel() {
		super();
	}
	

	public SearchEmployeeModel(String name, String address, String idCard, String phone, String minSalary,
			String maxSalary, String position, String gender, String ward, String district, String city,
			String birthday, String birthmonth, String birthyear, String startDate, String endDate) {
		super();
		this.name = name;
		this.address = address;
		this.idCard = idCard;
		this.phone = phone;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.position = position;
		this.gender = gender;
		this.ward = ward;
		this.district = district;
		this.city = city;
		this.birthday = birthday;
		this.birthmonth = birthmonth;
		this.birthyear = birthyear;
		this.startDate = startDate;
		this.endDate = endDate;
	}


	public String getBirthmonth() {
		return birthmonth;
	}


	public void setBirthmonth(String birthmonth) {
		this.birthmonth = birthmonth;
	}


	public String getBirthyear() {
		return birthyear;
	}


	public void setBirthyear(String birthyear) {
		this.birthyear = birthyear;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getMinSalary() {
		return minSalary;
	}
	public void setMinSalary(String minSalary) {
		this.minSalary = minSalary;
	}
	public String getMaxSalary() {
		return maxSalary;
	}
	public void setMaxSalary(String maxSalary) {
		this.maxSalary = maxSalary;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
