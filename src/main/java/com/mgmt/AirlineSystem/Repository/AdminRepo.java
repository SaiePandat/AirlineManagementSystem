package com.mgmt.AirlineSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mgmt.AirlineSystem.entity.Admin;



@Repository
public interface AdminRepo extends JpaRepository<Admin,Integer>{

}
