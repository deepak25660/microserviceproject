package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rating.entity.Rating;
import com.rating.service.RatingService;

@RestController
@RequestMapping("/Rating")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@GetMapping()
	ResponseEntity<?> getAllRating() {
		List<Rating> rating = ratingService.findAllRating();
		if (rating.isEmpty()) {
			return new ResponseEntity<>("There is no rating ", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(rating, HttpStatus.OK);
	}

	@PostMapping()
	ResponseEntity<?> giveRating(@RequestBody Rating rating) {
		String sc = ratingService.save(rating);

		return new ResponseEntity<>(sc, HttpStatus.CREATED);
	}

	@GetMapping("/{ratingId}")
	ResponseEntity<?> findRatingById(@PathVariable String ratingid) {
		return new ResponseEntity<>(ratingService.findRatingById(ratingid), HttpStatus.OK);
	}
	
	@GetMapping("/user/{userId}")
	ResponseEntity<?> findRatingByuserId(@PathVariable String userId)
	{
		return new ResponseEntity<>(ratingService.findRatingByUserId(userId), HttpStatus.OK);
	}
}
