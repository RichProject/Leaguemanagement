package com.fsoft.coffeesystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.GroupDeskDao;
import com.fsoft.coffeesystem.entity.GroupDesk;
import com.fsoft.coffeesystem.model.GroupDeskModel;

/**
 * @author NhanNN
 *
 */
@Service("groupDeskService")
public class GroupDeskService {
	@Autowired
	private GroupDeskDao groupDeskDao;
	public List<GroupDeskModel> listGroupDesks(){
		List<GroupDesk> groupDesks = groupDeskDao.listGroupDesks();
		List<GroupDeskModel> groupDeskModels = new ArrayList<>();
		//GroupDeskModel groupDeskModel;
		for (GroupDesk groupDesk : groupDesks) {
			GroupDeskModel groupDeskModel = new GroupDeskModel();
			groupDeskModel.setId((groupDesk.getId()));
			groupDeskModel.setName(groupDesk.getName());
			groupDeskModel.setCost(groupDesk.getCost());
			groupDeskModels.add(groupDeskModel);
		}
		return groupDeskModels;
	}
	public void addGroupDesk(GroupDeskModel groupDeskModel){
		GroupDesk groupDesk = new GroupDesk();
		groupDesk.setName(groupDeskModel.getName());
		groupDesk.setCost(groupDeskModel.getCost());
		groupDesk.setIsDelete(false);
		groupDeskDao.save(groupDesk);
	}
	public void delete(GroupDeskModel groupDeskModel) {
		GroupDesk groupDesk = groupDeskDao.findOne(groupDeskModel.getId());
		groupDesk.setIsDelete(true);
		groupDeskDao.save(groupDesk);
	}
	public void update(GroupDeskModel groupDeskModel) {
		GroupDesk groupDesk = groupDeskDao.findOne(groupDeskModel.getId());
		groupDesk.setName(groupDeskModel.getName());
		groupDesk.setCost(groupDeskModel.getCost());
		groupDeskDao.save(groupDesk);
	}
}
