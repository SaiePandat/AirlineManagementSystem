package com.mgmt.AirlineSystem.Services;

import java.util.List;

import com.mgmt.AirlineSystem.entity.Passengers;



public interface PassengerService {
	public Passengers savePass(Passengers passengers);
	
	public List<Passengers> passengerList();
	

}
