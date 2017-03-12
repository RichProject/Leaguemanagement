package com.fsoft.coffeesystem.model;

public class SearchProductModel {
	String name;
	String groupId;
	String priceFrom;
	String priceTo;
	public SearchProductModel() {
		super();
	}
	public SearchProductModel(String name, String groupId, String priceFrom, String priceTo) {
		super();
		this.name = name;
		this.groupId = groupId;
		this.priceFrom = priceFrom;
		this.priceTo = priceTo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPriceFrom() {
		return priceFrom;
	}
	public void setPriceFrom(String priceFrom) {
		this.priceFrom = priceFrom;
	}
	public String getPriceTo() {
		return priceTo;
	}
	public void setPriceTo(String priceTo) {
		this.priceTo = priceTo;
	}
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	

}
