package com.fsoft.coffeesystem.model;

public class SearchDeskModel {
	private String deskId;
	private String deskName;
	private String groupDeskName;
	private String deviceId;
	private String quantityOfSeats;

	public SearchDeskModel() {
		super();
	}
	public SearchDeskModel(String deskId, String deskName, String groupDeskName, String deviceId, String quantityOfSeats) {
		super();
		this.deskId = deskId;
		this.deskName = deskName;
		this.groupDeskName = groupDeskName;
		this.deviceId = deviceId;
		this.quantityOfSeats = quantityOfSeats;
		
	}
	public String getDeskId() {
		return deskId;
	}
	public void setDeskId(String deskId) {
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
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getQuantityOfSeats() {
		return quantityOfSeats;
	}
	public void setQuantityOfSeats(String quantityOfSeats) {
		this.quantityOfSeats = quantityOfSeats;
	}
}
