package com.app.beans;

public class Address {

	private int addrId;
	private String location;
	
	
	public int getAddrId() {
		return addrId;
	}
	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", location=" + location + "]";
	}
	
	
	
}
