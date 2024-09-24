package com.mgmt.AirlineSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

	@GetMapping("/")
    public String home() {
        return "index1";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/trending")
    public String trending() {
		return "trending";
    	
    }
    
    
    @GetMapping("/myservices")
    public String myServices() {
        return "services";
    }
    
    @GetMapping("/mydestinations")
    public String destinations() {
    	return "destinations";
    }
}
