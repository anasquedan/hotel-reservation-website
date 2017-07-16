package com.expedia.reservation_system.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.expedia.reservation_system.model.Hotel;
import com.expedia.reservation_system.model.OffersAndInfo;
import com.expedia.reservation_system.service.HotelsSearchService;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAction extends ActionSupport {

	final static Logger logger = Logger.getLogger(SearchAction.class);
	private static final long serialVersionUID = 1L;
	private UserBean userBean;
	private OffersAndInfo offersAndInfo;
	private List<Hotel> hotelList = new ArrayList<Hotel>();

	public OffersAndInfo getJsonObject() {
		return offersAndInfo;
	}

	public void setJsonObject(OffersAndInfo offersAndInfo) {
		this.offersAndInfo = offersAndInfo;
	}

	public List<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(List<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	public String execute() {
		try {
			HotelsSearchService searchService = HotelsSearchService.getInstance();
			this.hotelList = searchService.searchForHotelsOffers(userBean);

		} catch (Exception e) {
			logger.error(e);

		}
		return SUCCESS;
	}

	public UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(UserBean userBean) {
		this.userBean = userBean;
	}

}