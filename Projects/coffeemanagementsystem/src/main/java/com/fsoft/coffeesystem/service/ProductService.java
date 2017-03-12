package com.fsoft.coffeesystem.service;



import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.coffeesystem.dao.ProductDao;
import com.fsoft.coffeesystem.dao.ProductGroupDao;
import com.fsoft.coffeesystem.entity.Product;
import com.fsoft.coffeesystem.entity.ProductGroup;
import com.fsoft.coffeesystem.model.ProductModel;
import com.fsoft.coffeesystem.model.SearchProductModel;
import com.fsoft.coffeesystem.utilites.Convert;

@Service("productService")
public class ProductService {

	@Autowired
	private ProductDao productDao;
	@Autowired
	private ProductGroupDao productGroupDao;


	public void addProducts(ProductModel productModel){
		Product p= new Product();
		ProductGroup pg= productGroupDao.findOne(productModel.getProductGroupId());

		p.setName(productModel.getName());
		p.setProductGroup(pg);
		p.setPrice(productModel.getPrice());
		p.setStatus(productModel.isStatus());
		p.setDescription(productModel.getDescription());
		productDao.save(p);
	}
	
	public ProductModel getProductById(Integer id){
		ProductModel pm = new ProductModel();
		Product p = productDao.findOne(id);
		pm.setId(p.getId());
		pm.setName(p.getName());
		pm.setProductGroupId(p.getProductGroup().getId());
		pm.setPrice(p.getPrice());
		pm.setStatus(p.isStatus());
		pm.setDescription(p.getDescription());
		return pm;
	}
	
	public Boolean updateProduct(ProductModel productModel){
		Product p = productDao.findOne(productModel.getId());
		if(p == null)
			return false;
		int pgId = productModel.getProductGroupId();
		ProductGroup pg= productGroupDao.findOne(pgId);
		p.setName(productModel.getName());
		p.setProductGroup(pg);
		p.setStatus(productModel.isStatus());
		p.setDescription(productModel.getDescription());
		productDao.save(p);
		return true;
	}
	
	public List<ProductModel> searchProducts(SearchProductModel product) {
		List<Product> listProduct= new ArrayList<Product>();
		if(product.getGroupId().equalsIgnoreCase("rong")){
			listProduct = productDao.searchProducts(product.getName() ,
					Integer.parseInt(product.getPriceFrom().replaceAll(",", "").isEmpty() ? "0"
							: product.getPriceFrom().replaceAll(",", "")),
					Integer.parseInt(product.getPriceTo().replaceAll(",", "").isEmpty() ? "0"
							: product.getPriceTo().replaceAll(",", "")));
		} else {
			listProduct = productDao.searchProducts(product.getName(), Integer.parseInt(product.getGroupId()) ,
					Integer.parseInt(product.getPriceFrom().replaceAll(",", "").isEmpty() ? "0"
							: product.getPriceFrom().replaceAll(",", "")),
					Integer.parseInt(product.getPriceTo().replaceAll(",", "").isEmpty() ? "0"
							: product.getPriceTo().replaceAll(",", "")));
		}
		 
		List<ProductModel> listAddress = Convert.convertToProductModel(listProduct);
		return listAddress;
	}
}
