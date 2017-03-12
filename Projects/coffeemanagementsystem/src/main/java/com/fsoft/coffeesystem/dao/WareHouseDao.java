package com.fsoft.coffeesystem.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Warehouse;

public interface WareHouseDao extends JpaRepository<Warehouse,Integer> {
	@Query("select w from Warehouse w where w.material.name LIKE '%'||:material||'%' and w.isDelete = 0")
    List<Warehouse> searchWareHouse(@Param("material") String material);
	
	@Query("update Warehouse w set w.isDelete = true where w.id = :whId ")
	boolean deleteWh(@Param("whId")int id); 
}
