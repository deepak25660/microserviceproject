package com.hotel.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.entity.Hotel;
import com.hotel.exception.ResourceNotFound;
import com.hotel.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public List<Hotel> findAllHotel() {
		
		return hotelRepository.findAll();
	}

	@Override
	public Hotel findHotelById(String id) {
		Hotel hotel= hotelRepository.findById(id).orElseThrow(()->new ResourceNotFound("hotel id Doesn't exit"));
		return hotel;
	}

	@Override
	public String saveHotel(Hotel hotel) {
		String uuid =UUID.randomUUID().toString();
		hotel.setId(uuid);
		hotelRepository.save(hotel);
		return "Hotel created Successfully";
	}

}
