package com.rating.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rating.entity.Rating;
import com.rating.exception.ResourceNotFoundException;
import com.rating.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public List<Rating> findAllRating() {
	
		return ratingRepository.findAll();
	}

	@Override
	public String save(Rating rating) {
		
		String id= UUID.randomUUID().toString();
		rating.setRatingId(id);
		ratingRepository.save(rating);
		return "Rating given Succesfully";
	}

	@Override
	public Rating findRatingById(String ratingId) {
	
	   Rating rating=ratingRepository.findById(ratingId).orElseThrow(()->new ResourceNotFoundException("Rating Id doesn't Exit"));
	   
		return rating;
	}

	@Override
	public List<Rating> findRatingByUserId(String userId) {
	
		List<Rating> ratings = ratingRepository.findByUserId(userId);
		return ratings;
	}
}
