package com.fsoft.coffeesystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/abc")
public class ABCController {

	
	@RequestMapping("")
	public ModelAndView view (){
		return new ModelAndView("/templateadmin");
	}
}
