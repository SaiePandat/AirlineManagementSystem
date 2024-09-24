package com.mgmt.AirlineSystem.Services;


import java.util.List;

import com.mgmt.AirlineSystem.entity.Admin;



public interface AdminService {
public Admin saveAdmin(Admin admin);

public List<Admin> adminList();

}
