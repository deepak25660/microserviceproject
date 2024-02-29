package com.rating.service;

import java.util.List;

import com.rating.entity.Rating;

public interface RatingService {

	public List<Rating> findAllRating();

	public String save(final Rating rating);
	
	public Rating findRatingById(final String ratingId);
	
	public List<Rating> findRatingByUserId(final String userId);

}
