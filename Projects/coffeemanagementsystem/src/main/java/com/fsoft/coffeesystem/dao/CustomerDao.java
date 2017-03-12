package com.fsoft.coffeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {

	// @Procedure(name = "searchCustomer")
	// List<Customer> search(@Param("customerName") String name,
	// @Param("customerName") String phone,
	// @Param("customerName") Long point, @Param("customerName") Byte gender);

	// @Procedure
	// List<Customer> advance_search_customer(String name, String phone, Long
	// point, Byte gender);

	@Query("SELECT cust FROM Customer cust WHERE cust.name LIKE '%'|| :name ||'%' and "
			+ " cust.phoneNumber LIKE '%'|| :phoneNumber ||'%' AND (cust.point = :point OR :point IS NULL) AND"
			+ " (cust.gender = :gender) AND cust.isDelete = 0")
	List<Customer> search(@Param("name") String name, @Param("phoneNumber") String phone, @Param("point") Long point,
			@Param("gender") Byte gender);
}
