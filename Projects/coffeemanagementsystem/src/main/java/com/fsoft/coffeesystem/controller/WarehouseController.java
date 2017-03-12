package com.fsoft.coffeesystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.model.MaterialTypeModel;
import com.fsoft.coffeesystem.model.WarehouseModel;
import com.fsoft.coffeesystem.service.MaterialTypeService;
import com.fsoft.coffeesystem.service.WarehouseService;

@RestController
@RequestMapping("/")
public class WarehouseController {
	
	@Autowired
	WarehouseService warehouseService;
	@Autowired
	MaterialTypeService materialTypeService;
	
	@RequestMapping(value = "/warehouse", method = RequestMethod.GET)
	public ModelAndView getWarehouse() {
		return new ModelAndView("warehouse");
	}
	@RequestMapping(value ="/listWarehouse",method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_VALUE)
	public List<WarehouseModel> getListWH(@RequestBody WarehouseModel waModel){
		List<WarehouseModel> list = warehouseService.searchWarehouse(waModel);
		return list;
	}
	@RequestMapping(value ="/deleteWarehouse",method = RequestMethod.POST,  produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteWH(@RequestBody WarehouseModel waModel){
		return warehouseService.deleteWarehouse(waModel);
	}
	@RequestMapping(value = "/getAllMaterialType", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MaterialTypeModel> loadMaterialType(){
		return materialTypeService.getAllMaterialType();
	}
}
