/*@author: TuanVT2
 * 
 */
package com.fsoft.coffeesystem.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.model.ProductGroup;
import com.fsoft.coffeesystem.model.ProductGroupDetail;
import com.fsoft.coffeesystem.service.ProductGroupService;


/**
 * The Class ProductGroupController.
 */
@RestController
@RequestMapping("/productgroup")
public class ProductGroupController {
	
	/** The product group service. */
	@Autowired
	private ProductGroupService service;

	/** The Constant LOG. */
	static final Logger LOG = Logger.getLogger(ProductGroupController.class.getName());

	/**
	 * Inits the form.
	 *
	 * @return the model and view
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView initForm() {
		return new ModelAndView("productgroup");

	}
	/**
	 * Gets the product group.
	 *
	 * @return the product group
	 */
	@RequestMapping(value = "/getproductgroup", method = RequestMethod.GET)
	public List<ProductGroup> getProductGroup() {
		return service.getlistProductGroup();
	}

	/**
	 * Gets the product group detail.
	 *
	 * @return the product group detail
	 */
	@RequestMapping(value = "/getproductgroupdetail", method = RequestMethod.GET)
	public List<ProductGroupDetail> getProductGroupDetail() {
		return service.getListProductDetail();
	}
	
	/**
	 * Insert.
	 *
	 * @param name the name
	 * @param description the description
	 * @return true, if successful
	 */
	@RequestMapping(value="/insert",method=RequestMethod.GET)
	public boolean insert(@RequestParam String name, String description){
		return service.insert(name, description);
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public boolean updateProductGroup(@RequestParam int id,String name,String description) {

		return service.update(id, name, description);

	}
	/**
	 * Delete product group.
	 *
	 * @param id the id
	 * @return true, if successful
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public boolean deleteProductGroup(@RequestParam int id) {
		return service.delete(id);

	}
}
