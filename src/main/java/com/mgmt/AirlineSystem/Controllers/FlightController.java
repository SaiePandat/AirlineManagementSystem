package com.mgmt.AirlineSystem.Controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mgmt.AirlineSystem.Services.FlightService;
import com.mgmt.AirlineSystem.entity.Flight;

@Controller
public class FlightController {
	
	    @Autowired
	    private FlightService flightService;

	    @GetMapping("/manageFlights")
	    public String manageFlights(Model model) {
	        model.addAttribute("flight", new Flight());
			return "addflight";
	    }
	  

	    @PostMapping("/flight/add")
	    public String addFlight(Flight flight) {
	    	flightService.saveFlight(flight);
	        return "redirect:/listflight";
	    }
	    
	    @GetMapping("/listflight")
	    public String listFlights(Model model) {List<Flight> flights = flightService.getAllFlight();
        model.addAttribute("flights", flights);
        return "flightlist";
	    }

	    
	}
