package com.mgmt.AirlineSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.AirlineSystem.Repository.BookingRepository;
import com.mgmt.AirlineSystem.entity.Booking;
@Service
public class BookingServiceImp implements BookingService {

	@Autowired
	private BookingRepository bookingrepo;
	@Override
	public Booking saveBooking(Booking booking) {
		return bookingrepo.save(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		return bookingrepo.findAll();
	}
	
	
	
	
	
}