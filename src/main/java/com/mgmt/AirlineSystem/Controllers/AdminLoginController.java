package com.mgmt.AirlineSystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mgmt.AirlineSystem.Services.AdminService;
import com.mgmt.AirlineSystem.entity.AdminHome;


@Controller
public class AdminLoginController {
@Autowired
	private AdminService adminservice;

@GetMapping("/adminlogin")
	public String getadminLogin(Model model) {
		
		model.addAttribute("adminHome", new AdminHome());
		
		return "Adminhome";
		
  }
@PostMapping("/adminloginstatus")
public String getadminlogStatus(@Validated @ModelAttribute("adminHome") AdminHome adminHome,BindingResult bindResult,Model model) {
	if(bindResult.hasErrors()) {
		return "Adminhome";
	}
	List<com.mgmt.AirlineSystem.entity.Admin> dbAdminList=adminservice.adminList();
	boolean found=false;
	
	for(com.mgmt.AirlineSystem.entity.Admin dba:dbAdminList) {
		if(dba.getUsername().equals(adminHome.getUsername()) && dba.getPassword().equals(adminHome.getPassword())){
			
			found=true;
			break;
		}
	}
	
if(found==true) {

	 return "admindashboard"; 
 


}else {
	model.addAttribute("error","incorrect username or password");
	return "Adminhome";
	
}
	
}
}




