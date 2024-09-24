package com.mgmt.AirlineSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgmt.AirlineSystem.entity.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

	 Passenger findByEmail(String email);
}
