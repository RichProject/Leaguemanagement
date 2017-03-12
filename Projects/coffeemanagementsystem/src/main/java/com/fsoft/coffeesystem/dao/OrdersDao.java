package com.fsoft.coffeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Orders;

public interface OrdersDao extends JpaRepository<Orders, Integer> {

	@Query("select o from Orders o where o.customer.name LIKE %:name%")
	List<Orders> searchOrders(@Param("name") String name);
}
