package com.fsoft.coffeesystem.controller;



import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.dao.PromotionDao;
import com.fsoft.coffeesystem.entity.Promotion;
import com.fsoft.coffeesystem.model.PromotionModel;
import com.fsoft.coffeesystem.service.PromotionService;




@RestController
@RequestMapping("/")
public class PromotionController {
	@Autowired
	PromotionService promotionService;
	@Autowired
	PromotionDao promotionDao;
	Promotion pro;
	
	static final Logger log = Logger.getLogger(DeskController.class.getName());

	@RequestMapping(value = "/promotions", method = RequestMethod.GET)
	public ModelAndView initForm() {
		return new ModelAndView("listpromotion");
	}
	
	
	
	 public List<Promotion> findAll(@RequestParam("name") String promotionName,@RequestParam("start") Date startDate,@RequestParam("end") Date endDate) {
        return promotionDao.searchPromotions(promotionName, startDate, endDate);
    }
	
	  @RequestMapping(value = "/insertPromotions", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	    public Boolean insertPromotion(@RequestBody PromotionModel promotionModel ) {
		  
		  try {
			  	
			  	promotionService.createPromotion(promotionModel);
				return true;
			} catch (Exception e) {
				return false;
			}		
		  
	      
	    }
	  
		@RequestMapping(value = "/deletePromotions", method = RequestMethod.GET)
		public String deletePromotion(@RequestBody PromotionModel promotionModel) {
			return promotionService.delete(promotionModel);

		}
		
		@RequestMapping(value = "/updatePromotions", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
		public String updatePromotion(@RequestBody PromotionModel promotionModel ) {

			return promotionService.update(promotionModel);

		}
	  
}


