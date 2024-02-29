package com.hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotels")
public class Hotel {
	
	
	
	
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Hotel(String id, String hotelName, String location, String about) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.location = location;
		this.about = about;
	}



	@Id
	private String id;
	
	private String hotelName;
	
	private String location;
	
	private String about;

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getHotelName() {
		return hotelName;
	}



	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getAbout() {
		return about;
	}



	public void setAbout(String about) {
		this.about = about;
	}
	
	
	

}
