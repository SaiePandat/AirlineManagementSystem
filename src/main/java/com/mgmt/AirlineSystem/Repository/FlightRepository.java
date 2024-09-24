package com.mgmt.AirlineSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgmt.AirlineSystem.entity.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight,Integer> {

}
