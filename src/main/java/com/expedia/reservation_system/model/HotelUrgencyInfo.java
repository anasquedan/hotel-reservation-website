package com.expedia.reservation_system.model;

import java.util.ArrayList;

public class HotelUrgencyInfo {
	private int airAttachRemainingTime;

	public int getAirAttachRemainingTime() {
		return this.airAttachRemainingTime;
	}

	public void setAirAttachRemainingTime(int airAttachRemainingTime) {
		this.airAttachRemainingTime = airAttachRemainingTime;
	}

	private int numberOfPeopleViewing;

	public int getNumberOfPeopleViewing() {
		return this.numberOfPeopleViewing;
	}

	public void setNumberOfPeopleViewing(int numberOfPeopleViewing) {
		this.numberOfPeopleViewing = numberOfPeopleViewing;
	}

	private int numberOfPeopleBooked;

	public int getNumberOfPeopleBooked() {
		return this.numberOfPeopleBooked;
	}

	public void setNumberOfPeopleBooked(int numberOfPeopleBooked) {
		this.numberOfPeopleBooked = numberOfPeopleBooked;
	}

	private int numberOfRoomsLeft;

	public int getNumberOfRoomsLeft() {
		return this.numberOfRoomsLeft;
	}

	public void setNumberOfRoomsLeft(int numberOfRoomsLeft) {
		this.numberOfRoomsLeft = numberOfRoomsLeft;
	}

	private Object lastBookedTime;

	public Object getLastBookedTime() {
		return this.lastBookedTime;
	}

	public void setLastBookedTime(Object lastBookedTime) {
		this.lastBookedTime = lastBookedTime;
	}

	private String almostSoldStatus;

	public String getAlmostSoldStatus() {
		return this.almostSoldStatus;
	}

	public void setAlmostSoldStatus(String almostSoldStatus) {
		this.almostSoldStatus = almostSoldStatus;
	}

	private String link;

	public String getLink() {
		return this.link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	private ArrayList<Object> almostSoldOutRoomTypeInfoCollection;

	public ArrayList<Object> getAlmostSoldOutRoomTypeInfoCollection() {
		return this.almostSoldOutRoomTypeInfoCollection;
	}

	public void setAlmostSoldOutRoomTypeInfoCollection(ArrayList<Object> almostSoldOutRoomTypeInfoCollection) {
		this.almostSoldOutRoomTypeInfoCollection = almostSoldOutRoomTypeInfoCollection;
	}

	private boolean airAttachEnabled;

	public boolean getAirAttachEnabled() {
		return this.airAttachEnabled;
	}

	public void setAirAttachEnabled(boolean airAttachEnabled) {
		this.airAttachEnabled = airAttachEnabled;
	}
}