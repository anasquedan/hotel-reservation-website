package com.expedia.reservation_system.model;

public class OfferInfo {
	private String siteID;

	public String getSiteID() {
		return this.siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	private String language;

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	private String currency;

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
