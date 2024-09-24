package com.mgmt.AirlineSystem.Services;

import java.util.List;

import com.mgmt.AirlineSystem.entity.Flight;




public interface FlightService {
	public Flight saveFlight(Flight flight); 
	
	public List<Flight> getAllFlight();
}
