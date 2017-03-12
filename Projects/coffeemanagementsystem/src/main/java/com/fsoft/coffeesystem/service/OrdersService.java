package com.fsoft.coffeesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.OrdersDao;
import com.fsoft.coffeesystem.entity.Orders;
import com.fsoft.coffeesystem.model.CustomerModel;
import com.fsoft.coffeesystem.model.OrdersModel;
import com.fsoft.coffeesystem.utilites.Convert;

@Service("ordersService")
public class OrdersService {

	@Autowired
	private OrdersDao ordersDao;

	public List<OrdersModel> searchOrders(CustomerModel customerModel) {
		List<Orders> listOrders = ordersDao
				.searchOrders(customerModel.getName() == null ? "" : customerModel.getName());
		List<OrdersModel> result = Convert.convertToOrderModel(listOrders);
		return result;
	}

	public boolean deleteOrders(OrdersModel ordersModel) {
		Orders order = ordersDao.findOne(ordersModel.getId());
		order.setIsDelete(true);
		try {
			ordersDao.save(order);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
