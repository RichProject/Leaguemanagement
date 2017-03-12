package com.fsoft.coffeesystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.WareHouseDao;
import com.fsoft.coffeesystem.entity.Warehouse;
import com.fsoft.coffeesystem.model.WarehouseModel;
import com.fsoft.coffeesystem.utilites.Convert;
@Service("warehouseService")
public class WarehouseService {
	@Autowired
	private WareHouseDao waDao;
	
	public List<WarehouseModel> searchWarehouse(WarehouseModel warehouseModel){
		String key = warehouseModel.getName()!=null?warehouseModel.getName():"";
		List<Warehouse> listWH=waDao.searchWareHouse(key);
		List<WarehouseModel> listWHModel= Convert.convertWarehouse(listWH);
		return listWHModel;
	}

	public boolean deleteWarehouse(WarehouseModel waModel) {			
		Warehouse wahouse = waDao.findOne(waModel.getId());
		wahouse.setIsDelete(true);
			
			try
			{
				waDao.save(wahouse);
			}
			catch(Exception e)
			{
				return false;
			}
		
  		 return true;
	}
	
}
