package com.user.service.entity;

public class Rating {
	

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Rating(String ratingId, String hotelId, String userId, String rating, String feedBack) {
		super();
		this.ratingId = ratingId;
		this.hotelId = hotelId;
		this.userId = userId;
		this.rating = rating;
		this.feedBack = feedBack;
	}


	private String ratingId;

	private String hotelId;

	private String userId;

	private String rating;

	private String feedBack;

	public String getRatingId() {
		return ratingId;
	}


	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}


	public String getHotelId() {
		return hotelId;
	}


	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getFeedBack() {
		return feedBack;
	}


	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	
	
}
