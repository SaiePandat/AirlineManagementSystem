package com.mgmt.AirlineSystem.Services;

import org.springframework.stereotype.Service;

import com.mgmt.AirlineSystem.entity.Passenger;

@Service
public interface PassengerServices {

	 public Passenger savePassenger(Passenger passenger);
	 
	 public Passenger findByEmail(String email);
}
