package com.expedia.reservation_system.model;

public class HotelScores {
	private double rawAppealScore;

	public double getRawAppealScore() {
		return this.rawAppealScore;
	}

	public void setRawAppealScore(double rawAppealScore) {
		this.rawAppealScore = rawAppealScore;
	}

	private double movingAverageScore;

	public double getMovingAverageScore() {
		return this.movingAverageScore;
	}

	public void setMovingAverageScore(double movingAverageScore) {
		this.movingAverageScore = movingAverageScore;
	}
}
