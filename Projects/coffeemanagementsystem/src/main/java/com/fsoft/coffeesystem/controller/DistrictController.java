package com.fsoft.coffeesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fsoft.coffeesystem.model.DistrictModel;
import com.fsoft.coffeesystem.service.DistrictService;

@RestController
@RequestMapping("/")
public class DistrictController {
	
	@Autowired
	private DistrictService districtService;
	
	@RequestMapping(value = "/getListDistrict", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DistrictModel> getListDistrict(){
		return districtService.getListDistrict();
	}

}
