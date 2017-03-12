package com.fsoft.coffeesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.CustomerDao;
import com.fsoft.coffeesystem.entity.Customer;
import com.fsoft.coffeesystem.model.CustomerModel;

@Service("customerService")
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public List<Customer> search(Customer customer) {
		return customerDao.search(customer.getName(), customer.getPhoneNumber(), customer.getPoint(),
				customer.getGender());
	}

	public String update(CustomerModel customerModel) {
		Customer customer = customerDao.findOne(customerModel.getId());
		customer.setName(customerModel.getName());
		customer.setPhoneNumber(customerModel.getPhoneNumber());
		customer.setEmail(customerModel.getEmail());
		customer.setBirthday(customerModel.getBirthday());
		customer.setGender(customerModel.getGender());
		return saveJpa(customer);
	}

	public String delete(CustomerModel customerModel) {
		Customer customer = customerDao.findOne(customerModel.getId());
		customer.setIsDelete(true);
		return saveJpa(customer);
	}

//	private void updateData(Customer customer, CustomerModel customerModel) {
//		customer.setName(customerModel.getName());
//		customer.setPhoneNumber(customerModel.getPhoneNumber());
//		customer.setEmail(customerModel.getEmail());
//		customer.setBirthday(customerModel.getBirthday());
//		customer.setGender(customerModel.getGender());
//	}

	private String saveJpa(Customer customer) {
		try {
			customerDao.save(customer);
			return "{\"success\": true}";
		} catch (Exception e) {
			System.out.println(e);
			return "{\"success\": false}";
		}
	}
}
