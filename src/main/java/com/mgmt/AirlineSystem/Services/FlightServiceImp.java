package com.mgmt.AirlineSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.AirlineSystem.Repository.FlightRepository;
import com.mgmt.AirlineSystem.entity.Flight;



@Service
public class FlightServiceImp implements FlightService{
    @Autowired
	private FlightRepository flightRepository;

	@Override
	public Flight saveFlight(Flight flight) {
		// TODO Auto-generated method stub
		return flightRepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlight() {
		// TODO Auto-generated method stub
		return flightRepository.findAll();
	}


}