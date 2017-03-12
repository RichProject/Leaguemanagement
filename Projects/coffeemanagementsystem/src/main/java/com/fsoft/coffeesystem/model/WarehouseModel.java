package com.fsoft.coffeesystem.model;

import java.math.BigDecimal;

public class WarehouseModel {
	private int id;
	private String name;
	private String materialType;
	private BigDecimal price;
	private int quantity;
	public WarehouseModel() {
	}
	
	public WarehouseModel(int id, String name, String materialType, BigDecimal price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.materialType = materialType;
		this.price = price;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterialType() {
		return materialType;
	}
	public void setMaterialType(String materialType) {
		this.materialType = materialType;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal bigDecimal) {
		this.price = bigDecimal;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
