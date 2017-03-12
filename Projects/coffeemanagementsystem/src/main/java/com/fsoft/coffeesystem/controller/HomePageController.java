package com.fsoft.coffeesystem.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/")
public class HomePageController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView initForm() {
		return new ModelAndView("index");
	}
	
}
