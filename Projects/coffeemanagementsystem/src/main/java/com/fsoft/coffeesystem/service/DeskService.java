package com.fsoft.coffeesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.DeskDao;
import com.fsoft.coffeesystem.entity.Desk;
import com.fsoft.coffeesystem.model.DeskModel;
import com.fsoft.coffeesystem.model.SearchDeskModel;
import com.fsoft.coffeesystem.utilites.Convert;

@Service("deskService")
public class DeskService {
	/** The desk dao. */
	@Autowired
	private DeskDao deskDao;
//	@Autowired
//	private GroupDeskDao groupDeskDao;
//	@Autowired
//	private DeviceDao deviceDao;

	/**
	 * Search desks.
	 *
	 * @param desk
	 *            the desk
	 * @return the list
	 */

	public List<DeskModel> searchDesks(SearchDeskModel desk) {
		List<Desk> listDesks= new ArrayList<Desk>();
		if(desk.getGroupDeskName().equalsIgnoreCase("rong")){
			listDesks = deskDao.searchDesks(Integer.parseInt(desk.getDeskId()), desk.getDeskName(), 
					Integer.parseInt(desk.getDeviceId()), Integer.parseInt(desk.getQuantityOfSeats()));
		} else {
			listDesks = deskDao.searchDesks(Integer.parseInt(desk.getDeskId()), desk.getDeskName(), Integer.parseInt(desk.getDeviceId()), 
					Integer.parseInt(desk.getGroupDeskName()), Integer.parseInt(desk.getQuantityOfSeats()));
		}

		List<DeskModel> list = Convert.convertToDeskModel(listDesks);
		return list;
	}

	/**
	 * 
	 * @param deskModel
	 * @return true if add ok 
	 */
	public boolean addDesk(DeskModel deskModel) {
//		GroupDesk groupDesk = groupDeskDao.findOne(deskModel.getGroupDeskId());
//		Device device = deviceDao.findOne(deskModel.getDeviceId());
		return true;
	}
}
