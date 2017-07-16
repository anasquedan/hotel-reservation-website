package com.expedia.reservation_system.model;


public class OffersAndInfo {
	private OfferInfo offerInfo;

	public OfferInfo getOfferInfo() {
		return this.offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	private UserInfo userInfo;

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	private Offers offers;

	public Offers getOffers() {
		return this.offers;
	}

	public void setOffers(Offers offers) {
		this.offers = offers;
	}
}