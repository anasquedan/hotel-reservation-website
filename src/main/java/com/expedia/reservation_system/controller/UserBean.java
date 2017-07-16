package com.expedia.reservation_system.controller;

import com.expedia.reservation_system.model.OffersAndInfo;

public class UserBean {
	private String destinationName, destinationCity, regionIds, maxTripStartDate, minTripStartDate, lengthOfStay,
			maxStarRating, minStarRating, maxTotalRate, minTotalRate, maxGuestRating, minGuestRating;
	private OffersAndInfo offersAndInfo;

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public String getDestinationCity() {
		return destinationCity;
	}

	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getRegionIds() {
		return regionIds;
	}

	public void setRegionIds(String regionIds) {
		this.regionIds = regionIds;
	}

	public String getMaxTripStartDate() {
		return maxTripStartDate;
	}

	public void setMaxTripStartDate(String maxTripStartDate) {
		this.maxTripStartDate = maxTripStartDate;
	}

	public String getMinTripStartDate() {
		return minTripStartDate;
	}

	public void setMinTripStartDate(String minTripStartDate) {
		this.minTripStartDate = minTripStartDate;
	}

	public String getLengthOfStay() {
		return lengthOfStay;
	}

	public void setLengthOfStay(String lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	public String getMaxStarRating() {
		return maxStarRating;
	}

	public void setMaxStarRating(String maxStarRating) {
		this.maxStarRating = maxStarRating;
	}

	public String getMaxTotalRate() {
		return maxTotalRate;
	}

	public void setMaxTotalRate(String maxTotalRate) {
		this.maxTotalRate = maxTotalRate;
	}

	public String getMinTotalRate() {
		return minTotalRate;
	}

	public void setMinTotalRate(String minTotalRate) {
		this.minTotalRate = minTotalRate;
	}

	public String getMaxGuestRating() {
		return maxGuestRating;
	}

	public void setMaxGuestRating(String maxGuestRating) {
		this.maxGuestRating = maxGuestRating;
	}

	public String getMinGuestRating() {
		return minGuestRating;
	}

	public void setMinGuestRating(String minGuestRating) {
		this.minGuestRating = minGuestRating;
	}

	public String getMinStarRating() {
		return minStarRating;
	}

	public void setMinStarRating(String minStarRating) {
		this.minStarRating = minStarRating;
	}

	public OffersAndInfo getOffersAndInfo() {
		return offersAndInfo;
	}

	public void setOffersAndInfo(OffersAndInfo offersAndInfo) {
		this.offersAndInfo = offersAndInfo;
	}

}