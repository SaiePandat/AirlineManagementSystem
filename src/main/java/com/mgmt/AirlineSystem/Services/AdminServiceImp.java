package com.mgmt.AirlineSystem.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgmt.AirlineSystem.Repository.AdminRepo;
import com.mgmt.AirlineSystem.entity.Admin;


@Service
public class AdminServiceImp implements AdminService{

	@Autowired
	private AdminRepo adminRepo;

	@Override
	public Admin saveAdmin(Admin admin) {
				return adminRepo.save(admin);
	}

	@Override
	public List<Admin> adminList() {
		List<Admin> find= adminRepo.findAll();
		return find;
	}

	
	
	
	

}
