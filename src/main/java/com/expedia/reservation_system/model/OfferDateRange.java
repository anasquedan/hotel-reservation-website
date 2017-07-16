package com.expedia.reservation_system.model;
import java.util.ArrayList; 
public class OfferDateRange {
	private ArrayList<Integer> travelStartDate;

  public ArrayList<Integer> getTravelStartDate() { return this.travelStartDate; }

	public void setTravelStartDate(ArrayList<Integer> travelStartDate) { this.travelStartDate = travelStartDate; }

  private ArrayList<Integer> travelEndDate;

  public ArrayList <Integer>

	getTravelEndDate() { return this.travelEndDate; }

	public void setTravelEndDate(ArrayList<Integer> travelEndDate) { this.travelEndDate = travelEndDate; }

	private Integer lengthOfStay;

	public Integer getLengthOfStay() {
		return this.lengthOfStay;
	}

	public void setLengthOfStay(Integer lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}
}