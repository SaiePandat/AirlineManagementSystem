package com.mgmt.AirlineSystem.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mgmt.AirlineSystem.Repository.PassRepo;
import com.mgmt.AirlineSystem.entity.Passengers;

import jakarta.transaction.Transactional;

@Controller
@Transactional
public class PassController {
    @Autowired
    private PassRepo pr;

    @GetMapping("/passregistration") // Update mapping to direct access to passregistration
    public String regPassenger(Model model) {
        model.addAttribute("passengers",new Passengers());
        return "passregistration"; // Return directly passregistration
    }

    @PostMapping("/passtatus")
    public String getStatus(@Validated @ModelAttribute("passengers") Passengers passengers ,BindingResult bindResult) {
        if(bindResult.hasErrors()) {
            return "passregistration"; // Return passregistration in case of errors
        }

        pr.save(passengers);
        return "redirect:/Passlogin";
    }
}
