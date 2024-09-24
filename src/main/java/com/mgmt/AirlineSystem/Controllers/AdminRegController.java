package com.mgmt.AirlineSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mgmt.AirlineSystem.Services.AdminService;
import com.mgmt.AirlineSystem.entity.Admin;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class AdminRegController {
@Autowired
	private AdminService adminservice;
@GetMapping("/adminregister")
public String regiAdmin(Model model) {
	
	model.addAttribute("admin", new Admin());
	
	return "AdminRegestration";
	
}
@PostMapping("/adminstatus")
public String getadminStatus(@Validated @ModelAttribute("admin") Admin admin,BindingResult bindResult) {
	if(bindResult.hasErrors()) {
		return "AdminRegestration";
	}
	adminservice.saveAdmin(admin);
	return "redirect:/adminlogin";
}

}

	
	

