package com.fsoft.coffeesystem.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.PromotionDao;
import com.fsoft.coffeesystem.dao.StoreDao;
import com.fsoft.coffeesystem.entity.Promotion;
import com.fsoft.coffeesystem.model.PromotionModel;

@Service("promotionService")
public class PromotionService {
	
	@Autowired
	PromotionDao promotionDao;
	@Autowired
	StoreDao storeDao;
	Date startDate;
	Date endDate;
	

	public void createPromotion(PromotionModel promotionModel) {
	
	SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

	Promotion pro = new Promotion();
	try {
		startDate = formatter.parse(promotionModel.getStartDate());
		endDate = formatter.parse(promotionModel.getEndDate());
		//Store pg = storeDao.findOne(promotionModel.getStoreId());
		pro.setName(promotionModel.getName());
		pro.setStartDate(startDate);
		pro.setEndDate(endDate);
		pro.setIsDelete(false);
		//pro.setStore(pg);
		promotionDao.save(pro);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
	public String update(PromotionModel promotionModel) {
		Promotion pro = promotionDao.findOne(promotionModel.getId());
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			startDate = formatter.parse(promotionModel.getStartDate());
			endDate = formatter.parse(promotionModel.getEndDate());
			//Store pg = storeDao.findOne(promotionModel.getStoreId());
			pro.setName(promotionModel.getName());
			pro.setStartDate(startDate);
			pro.setEndDate(endDate);
			pro.setIsDelete(false);
			//pro.setStore(pg);
			promotionDao.save(pro);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return saveJpa(pro);
	}

	public String delete(PromotionModel promotionModel) {
		Promotion pro = promotionDao.findOne(promotionModel.getId());	
		pro.setIsDelete(true);
		return saveJpa(pro);
	}
	
	
	private String saveJpa(Promotion promotion) {
		try {
			promotionDao.save(promotion);
			return "{\"success\": true}";
		} catch (Exception e) {
			System.out.println(e);
			return "{\"success\": false}";
		}
	}
	
}
