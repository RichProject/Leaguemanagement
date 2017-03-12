package com.fsoft.coffeesystem.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.fsoft.coffeesystem.model.GroupDeskModel;
import com.fsoft.coffeesystem.service.GroupDeskService;
@RestController
@RequestMapping("/")
public class GroupDeskController {
	static final Logger log = Logger.getLogger(ProductController.class.getName());
	@Autowired
	GroupDeskService groupDeskService;
	
	@RequestMapping(value = "/listgroupdesk", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView initForm() {
		
		ModelAndView modelAndView = new ModelAndView("listgroupdesks");
		//modelAndView.addObject("data",groupDeskService.listGroupDesks());
		return modelAndView;
	}
	@RequestMapping(value = "/getlistgroupdesk", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<GroupDeskModel> getList() {
		return groupDeskService.listGroupDesks();
	}
	@RequestMapping(value = "/addgroupdesk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean addGroupDesk(@RequestBody GroupDeskModel groupDeskModel) {
		try { 
			groupDeskService.addGroupDesk(groupDeskModel);
			return true;
		} catch (Exception e) {
			log.log(Level.INFO, e.getMessage(), e);
			return false;
		}
	}
	@RequestMapping(value = "/deletegroupdesk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean deleteGroupDesk(@RequestBody GroupDeskModel groupDeskModel) {
		try { 
			groupDeskService.delete(groupDeskModel);
			return true;
		} catch (Exception e) {
			log.log(Level.INFO, e.getMessage(), e);
			return false;
		}
	}
	@RequestMapping(value = "/updategroupdesk", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean updateGroupDesk(@RequestBody GroupDeskModel groupDeskModel) {
		try { 
			groupDeskService.update(groupDeskModel);;
			return true;
		} catch (Exception e) {
			log.log(Level.INFO, e.getMessage(), e);
			return false;
		}
	}
}
