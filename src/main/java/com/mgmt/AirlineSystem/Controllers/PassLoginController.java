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

import com.mgmt.AirlineSystem.Services.FlightService;
import com.mgmt.AirlineSystem.Services.PassengerService;
import com.mgmt.AirlineSystem.entity.Flight;
import com.mgmt.AirlineSystem.entity.PassHome;
import com.mgmt.AirlineSystem.entity.Passengers;


@Controller
public class PassLoginController {
    @Autowired
    private PassengerService ps;
    @Autowired
    private FlightService flightService;

    @GetMapping("/Passlogin")
    public String getLogin(Model model) {
        model.addAttribute("passHome", new PassHome());
        return "passHome";
    }

    @PostMapping("/passloginstatus")
    public String getLogStatus(@Validated @ModelAttribute("passHome") PassHome passHome, BindingResult bindResult, Model model) {
        if (bindResult.hasErrors()) {
            return "passHome";
        }

        List<Passengers> dbpassengerList = ps.passengerList();
        boolean found = false;
        for (Passengers dbp : dbpassengerList) {
            if (dbp.getUsername().equals(passHome.getUsername()) && dbp.getPassword().equals(passHome.getPassword())) {
                found = true;
                break;
            }
        }

        if (found) {
            List<Flight> flights = flightService.getAllFlight();
            model.addAttribute("flights", flights);
            return "flightlist";
        } else {
            model.addAttribute("error", "Incorrect username or password");
            return "passHome";
        }
    }
}
