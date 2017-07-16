package com.expedia.reservation_system.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.expedia.reservation_system.controller.UserBean;
import com.expedia.reservation_system.model.Hotel;
import com.expedia.reservation_system.model.OffersAndInfo;
import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class HotelsSearchService {
	private static final String EMPTY_JSON_ARRAY = "Empty json array!";
	private static final String EXPEDIA_LINK = "https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel";

	private static HotelsSearchService instance;
	final static Logger logger = Logger.getLogger(HotelsSearchService.class);
	private List<Hotel> hotelList = new ArrayList<Hotel>();

	private UserBean userBean;

	private HotelsSearchService() {
	}

	public static HotelsSearchService getInstance() {
		if (instance == null) {
			instance = new HotelsSearchService();
		}
		return instance;
	}

	public List<Hotel> searchForHotelsOffers(UserBean userBean) {

		// used to call restful client
		Client client = Client.create();
		WebResource webResource = client.resource(EXPEDIA_LINK);
		this.setUserBean(userBean);

		String regionIds = userBean.getRegionIds();
		if (regionIds != null)
			webResource = webResource.queryParam("regionIds", regionIds);
		String destinationName = userBean.getDestinationName();
		if (destinationName != null)
			webResource = webResource.queryParam("destinationName", destinationName);
		String destinationCity = userBean.getDestinationCity();
		if (destinationCity != null)
			webResource = webResource.queryParam("destinationCity", destinationCity);
		String minTripStartDate = userBean.getMinTripStartDate();
		if (minTripStartDate != null)
			webResource = webResource.queryParam("minTripStartDate", minTripStartDate);
		String maxTripStartDate = userBean.getMaxTripStartDate();
		if (maxTripStartDate != null)
			webResource = webResource.queryParam("maxTripStartDate", maxTripStartDate);
		String lengthOfStay = userBean.getLengthOfStay();
		if (lengthOfStay != null)
			webResource = webResource.queryParam("lengthOfStay", lengthOfStay);
		String maxStarRating = userBean.getMaxStarRating();
		if (maxStarRating != null)
			webResource = webResource.queryParam("maxStarRating", maxStarRating);
		String minStarRating = userBean.getMinStarRating();
		if (minStarRating != null)
			webResource = webResource.queryParam("minStarRating", minStarRating);
		String maxTotalRate = userBean.getMaxTotalRate();
		if (maxTotalRate != null)
			webResource = webResource.queryParam("maxTotalRate", maxTotalRate);
		String minTotalRate = userBean.getMinTotalRate();
		if (minTotalRate != null)
			webResource = webResource.queryParam("minTotalRate", minTotalRate);
		String maxGuestRating = userBean.getMaxGuestRating();
		if (maxGuestRating != null)
			webResource = webResource.queryParam("maxGuestRating", maxGuestRating);
		String minGuestRating = userBean.getMinGuestRating();
		if (minGuestRating != null)
			webResource = webResource.queryParam("minGuestRating", minGuestRating);

		// retrieve returned JSON data
		ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

		// check if returned http is 200 OK or not to throw an error
		if (response.getStatus() != 200) {
			logger.error("Failed : HTTP error code : " + response.getStatus());
			return null;
		}
		Gson gson = new Gson();
		String jsonOutput = response.getEntity(String.class);
		OffersAndInfo offersAndInfo = (OffersAndInfo) gson.fromJson(jsonOutput, OffersAndInfo.class);

		if (offersAndInfo != null) {
			if (offersAndInfo.getOffers() != null)
				hotelList.addAll(offersAndInfo.getOffers().getHotel());
		} else {
			logger.info(EMPTY_JSON_ARRAY);
		}

		return hotelList;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

}