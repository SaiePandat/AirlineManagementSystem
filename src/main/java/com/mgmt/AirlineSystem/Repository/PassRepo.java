package com.mgmt.AirlineSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgmt.AirlineSystem.entity.Passengers;


@Repository
public interface PassRepo extends JpaRepository<Passengers,Integer>{

}
