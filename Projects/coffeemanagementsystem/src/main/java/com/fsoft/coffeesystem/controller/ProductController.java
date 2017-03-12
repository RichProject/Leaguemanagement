package com.fsoft.coffeesystem.controller;


import java.util.logging.Level;
import java.util.logging.Logger;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fsoft.coffeesystem.model.ProductModel;
import com.fsoft.coffeesystem.model.SearchProductModel;
import com.fsoft.coffeesystem.service.ProductService;

@RestController
@RequestMapping("/")
public class ProductController {
	static final Logger log = Logger.getLogger(ProductController.class.getName());

	@Autowired
	ProductService productService;

	@RequestMapping(value = "/homeAddProducts", method = RequestMethod.GET)
	public ModelAndView home(){
		return new ModelAndView("addProducts");
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView initForm() {
		return new ModelAndView("listproduct");
	}

	@RequestMapping(value = "/addProducts", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean addProducts(@RequestBody ProductModel productModel){
		try { 
			productService.addProducts(productModel);	
			return true;
		} catch (Exception e) {
			log.log(Level.INFO, e.getMessage(), e);
			return false;
		}		
	}
	
	@RequestMapping(value = "/getProducts/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductModel getProducts(@PathVariable("id") int id){
		ProductModel pm = productService.getProductById(id);
		if(pm == null)
			System.out.println("Not found " + id);
		return pm;
	}
	

	@RequestMapping(value = "/updateProducts", method = RequestMethod.POST)
	public boolean updateProducts(@RequestBody ProductModel productModel){
		Boolean test = productService.updateProduct(productModel);
		return test;	
	}

	
	@RequestMapping(value = "/searchproducts", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductModel> searchProducts(@RequestBody SearchProductModel product) {
		List<ProductModel> listAddress= productService.searchProducts(product);
		return listAddress;
	}

}
