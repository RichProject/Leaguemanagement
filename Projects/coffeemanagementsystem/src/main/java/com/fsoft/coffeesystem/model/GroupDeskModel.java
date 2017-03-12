	package com.fsoft.coffeesystem.model;

import java.math.BigDecimal;

/**
 * @author NhanNN
 *
 */
public class GroupDeskModel {
	/**
	 * 
	 */
	private int id;
	private String name;
	private BigDecimal cost;
	
	/**
	 * @param id
	 * @param name
	 * @param cost
	 */
	public GroupDeskModel(int id, String name, BigDecimal cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public GroupDeskModel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public GroupDeskModel(){
		
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
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
}
