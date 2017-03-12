package com.fsoft.coffeesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.model.CustomerModel;
import com.fsoft.coffeesystem.model.OrdersModel;
import com.fsoft.coffeesystem.service.OrdersService;

@RestController
public class OrdersController {
	@Autowired
	OrdersService ordersService;

	@RequestMapping(value = "/viewOrders", method = RequestMethod.GET)
	public ModelAndView initForm() {
		return new ModelAndView("orders");
	}

	@RequestMapping(value = "/searchOrders", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OrdersModel> search(@RequestBody CustomerModel customerModel) {
		List<OrdersModel> result = ordersService.searchOrders(customerModel);
		return result;
	}

	@RequestMapping(value = "/deleteOrder", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteOrders(@RequestBody OrdersModel ordersModel) {
		boolean result = ordersService.deleteOrders(ordersModel);
		return result;
	}
}
