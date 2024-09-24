package com.mgmt.AirlineSystem.Services;

import java.util.List;

import com.mgmt.AirlineSystem.entity.Booking;

public interface BookingService {

	public Booking saveBooking(Booking booking);
	
	public List<Booking> getAllBooking();
}