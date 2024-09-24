package com.mgmt.AirlineSystem.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ContentController {
	@GetMapping("/airindia")
    public String airIndia() {
        return "air-india";
    }
	
	@GetMapping("/express")
	 public String airExpress() {
	        return "air-express";
	    }
	
	@GetMapping("/akasa")
	 public String akasa() {
	        return "akasa";
	    }
	 
	@GetMapping("/indigo")
	 public String indigo() {
	        return "indigo";
	    }
	 
	@GetMapping("/spice")
	 public String spiceJet() {
	        return "spice";
	    }
	 
	@GetMapping("/vistara")
	 public String vistara() {
	        return "vistara";
	    }

}
