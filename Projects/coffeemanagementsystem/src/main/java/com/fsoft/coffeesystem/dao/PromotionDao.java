package com.fsoft.coffeesystem.dao;


import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fsoft.coffeesystem.entity.Promotion;




public interface PromotionDao extends JpaRepository<Promotion, Integer>{
	@Query( " select pm.name, pm.startDate, pm.endDate from Promotion pm " + 
			" where ( :name is null or pm.name like '%'+:name+'%') " + 
			" and ( :startDate is null or pm.startDate <= :startDate) " + 
			" and ( :endDate is null or pm.endDate >= :endDate )  ")
     List<Promotion> searchPromotions(@Param("name") String promotionName,@Param("startDate") Date startDate,@Param("endDate") Date endDate);
	
  
}




