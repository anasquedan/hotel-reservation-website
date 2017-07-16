package com.expedia.reservation_system.model;

public class Destination {
	private String regionID;

	public String getRegionID() {
		return this.regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	private String longName;

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	private String country;

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	private String province;

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	private String city;

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}
}
