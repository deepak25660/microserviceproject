package com.hotel.service;

import java.util.List;

import com.hotel.entity.Hotel;

public interface HotelService {

	List<Hotel> findAllHotel();
	
	Hotel findHotelById(String id);
	
	String saveHotel(Hotel hotel);
}
