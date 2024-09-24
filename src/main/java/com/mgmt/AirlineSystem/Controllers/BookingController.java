package com.mgmt.AirlineSystem.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mgmt.AirlineSystem.Services.BookingService;
import com.mgmt.AirlineSystem.entity.Booking;

@Controller
public class BookingController {
	@Autowired
	private BookingService bookingservice;
	
	
	 @GetMapping("/managebooking")
	    public String manageFlights(Model model) {
	        model.addAttribute("booking", new Booking());
			return "addbooking";
	    }
	  

	    @PostMapping("/booking/add")
	    public String addBooking(Booking booking) {
	    	bookingservice.saveBooking(booking);
	    	return "ticket";//check
	    }

	    @GetMapping("/listbooking")
	    
	    public String listbooking(Model model) {
	        List<Booking> booking = bookingservice.getAllBooking();
	        model.addAttribute("bookings", booking);
	        return "bookinglist";
	    }
	
	    @PostMapping("/flight/book")
	    public String addPass(Model model) {
	    	model.addAttribute("booking",new Booking());
			return "addbooking";
	    }

}