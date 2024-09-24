package com.mgmt.AirlineSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.AirlineSystem.Repository.PassRepo;
import com.mgmt.AirlineSystem.entity.Passengers;


@Service
public class PassServiceImp implements PassengerService{
	@Autowired
	 private PassRepo pr;
	
	@Override
	public Passengers savePass(Passengers passengers) {
		return pr.save(passengers);
	}

	@Override
	public List<Passengers> passengerList() {
		List<Passengers> findAll=pr.findAll();
		return findAll;
	}

}
