package com.mgmt.AirlineSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class DestinationController {

	@GetMapping("/sk")
    public String southKorea() {
        return "sk";
    }
	
	@GetMapping("/mh")
    public String maharashtra() {
        return "mh";
    }
	
	@GetMapping("/bali")
    public String airIndia() {
        return "bali";
    }
	
	@GetMapping("/dubai")
    public String dubai() {
        return "dubai";
    }
	
	@GetMapping("/singapore")
    public String singapore() {
        return "singapore";
    }
	
	
	
	@GetMapping("/maldives")
    public String maldives() {
        return "maldives";
    }
}
