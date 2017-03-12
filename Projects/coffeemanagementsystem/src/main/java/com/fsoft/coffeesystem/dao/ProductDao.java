package com.fsoft.coffeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

	
	@Query("select p from Product p where p.name LIKE '%'||:name||'%' and"
			+ " p.productGroup.id = :groupid and ( :pricefrom = 0 or p.price > :pricefrom )"
			+ " and ( :priceto = 0 or p.price < :priceto )")
    List<Product> searchProducts(@Param("name") String name,@Param("groupid") Integer groupId,
    		@Param("pricefrom") Integer priceFrom, @Param("priceto") Integer priceTo );
	
	@Query("select p from Product p where p.name LIKE '%'||:name||'%' and"
			+ "  ( :pricefrom = 0 or p.price > :pricefrom )"
			+ " and ( :priceto = 0 or p.price < :priceto )")
    List<Product> searchProducts(@Param("name") String name,
    		@Param("pricefrom") Integer priceFrom, @Param("priceto") Integer priceTo );
	
	

}
