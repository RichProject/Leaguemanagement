package com.fsoft.coffeesystem.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.entity.Customer;
import com.fsoft.coffeesystem.model.CustomerModel;
import com.fsoft.coffeesystem.service.CustomerService;
import com.fsoft.coffeesystem.utilites.Convert;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	static final Logger log = Logger.getLogger(CustomerController.class.getName());
	
	@RequestMapping("")
	public ModelAndView view (){
		return new ModelAndView("/customermanagement");
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public @ResponseBody List<CustomerModel> search (@RequestBody Customer data) {
		return Convert.convertCustomer(customerService.search(data));
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody String add (@RequestBody CustomerModel data) {
//		return saveJpa(data);
		return "";
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public @ResponseBody String delete (@RequestBody CustomerModel data) {
		return customerService.delete(data);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody String update (@RequestBody CustomerModel data) {
		return customerService.update(data);
	}
	
}
