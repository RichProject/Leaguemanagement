package com.fsoft.coffeesystem.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.model.DeskModel;
import com.fsoft.coffeesystem.model.SearchDeskModel;
import com.fsoft.coffeesystem.service.DeskService;


@RestController
@RequestMapping("/desk")
public class DeskController {
	@Autowired
	DeskService deskService;
	static final Logger log = Logger.getLogger(DeskController.class.getName());

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView initForm() {
		return new ModelAndView("listdesks");
	}

	@RequestMapping(value = "/searchdesks", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<DeskModel> search(@RequestBody SearchDeskModel desk) {
		log.info(desk.getDeskId()+ "," + desk.getDeskName() + "," + desk.getGroupDeskName() + "," + desk.getDeviceId()+ "," + desk.getQuantityOfSeats());

		List<DeskModel> listDesks= deskService.searchDesks(desk);
		return listDesks;
	}
	
	@RequestMapping(value="/addDesk",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView addDesk(@RequestBody DeskModel deskModel){		
		deskService.addDesk(deskModel);
		return new ModelAndView("listdesks");		
	}
	
}
