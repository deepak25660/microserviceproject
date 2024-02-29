package com.hotel.controller;

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
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hotel.entity.Hotel;
import com.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {

	@Autowired
	private HotelService hotelService;

	@GetMapping()
	public ResponseEntity<?> getAllHotel() {
		List<Hotel> hotels = hotelService.findAllHotel();
		if (hotels.isEmpty()) {
			return new ResponseEntity<>(" there is no hotel", HttpStatus.NOT_FOUND);

		}
		return new ResponseEntity<>(hotels, HttpStatus.OK);
	}

	@GetMapping("/{hotelId}")
	public ResponseEntity<?> getHotelById(@PathVariable String hotelId) {
		return new ResponseEntity<>(hotelService.findHotelById(hotelId), HttpStatus.NOT_FOUND);
	}

	@PostMapping()
	public ResponseEntity<?> createHotel(@RequestBody Hotel hotel) {
		String message = hotelService.saveHotel(hotel);

		return new ResponseEntity<>(message, HttpStatus.CREATED);
	}

}