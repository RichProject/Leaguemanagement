package com.fsoft.coffeesystem.model;

public class DeskModel {

	private int deskId;
	private String deskName;
	private String groupDeskName;
	private int groupDeskId;
	private Integer deviceId;
	private Integer quantityOfSeats;
	private String storeName;
	private String description;

	public DeskModel() {
		super();
	}


	public DeskModel(String deskName, int groupDeskId, Integer deviceId, Integer quantityOfSeats, String storeName,
			String description) {
		super();
		this.deskName = deskName;
		this.groupDeskId = groupDeskId;
		this.deviceId = deviceId;
		this.quantityOfSeats = quantityOfSeats;
		this.storeName = storeName;
		this.description = description;
	}

	public DeskModel(int deskId, String deskName, String groupDeskName, int groupDeskId, Integer deviceId,
			Integer quantityOfSeats, String storeName, String description) {
		super();
		this.deskId = deskId;
		this.deskName = deskName;
		this.groupDeskName = groupDeskName;
		this.groupDeskId = groupDeskId;
		this.deviceId = deviceId;
		this.quantityOfSeats = quantityOfSeats;
		this.storeName = storeName;
		this.description = description;
	}


	public int getDeskId() {
		return deskId;
	}
	public void setDeskId(int deskId) {
		this.deskId = deskId;
	}


	public String getDeskName() {
		return deskName;
	}
	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}
	public String getGroupDeskName() {
		return groupDeskName;
	}
	public void setGroupDeskName(String groupDeskName) {
		this.groupDeskName = groupDeskName;
	}
	public Integer getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}
	public Integer getQuantityOfSeats() {
		return quantityOfSeats;
	}
	public void setQuantityOfSeats(Integer quantityOfSeats) {
		this.quantityOfSeats = quantityOfSeats;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getGroupDeskId() {
		return groupDeskId;
	}
	public void setGroupDeskId(int groupDeskId) {
		this.groupDeskId = groupDeskId;
	}



}

