package com.mgmt.AirlineSystem.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.AirlineSystem.Repository.PassengerRepository;
import com.mgmt.AirlineSystem.entity.Passenger;
@Service
public class PassengerServicesImp implements PassengerServices{

	@Autowired
	public PassengerRepository passengerRepository;

	@Override
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepository.save(passenger);
	}

	@Override
	public Passenger findByEmail(String email) {
				return passengerRepository.findByEmail(email);
	}
}
