package com.fsoft.coffeesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.DistrictDao;
import com.fsoft.coffeesystem.entity.District;
import com.fsoft.coffeesystem.model.DistrictModel;

@Service("districtService")
public class DistrictService {

	@Autowired
	private DistrictDao districtDao;
	
	public List<DistrictModel> getListDistrict(){
		List<District> list = districtDao.findAll();
		List<DistrictModel> getList = new ArrayList<>();
		for (District district : list) {
			DistrictModel districtModel = new DistrictModel();
			districtModel.setId(district.getId());
			districtModel.setName(district.getName());
			getList.add(districtModel);
		}
		return getList;
	}
}
