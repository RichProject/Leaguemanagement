package com.fsoft.coffeesystem.model;

public class ProductGroup {
	int id;
	String name;

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

	public ProductGroup(int i, String name) {
		super();
		this.id = i;
		this.name = name;
	}

	public ProductGroup() {

	}
}
