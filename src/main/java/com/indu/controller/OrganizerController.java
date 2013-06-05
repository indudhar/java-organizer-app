package com.indu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Organizer Controller to recieve and service http requests
 * 
 * @author Indu Devanath
 *
 */

@Controller
public class OrganizerController {

	@RequestMapping({"/","/home","/start"})
	public String startHome(ModelMap model) {
		
		model.addAttribute("message", "Home Page");
		return "start";

	}
	
	@RequestMapping("/new_registration")
	public String newRegistration(){
		return "newRegister";
	}
	
	@RequestMapping("/registrant_details")
	public String registrantDetails(@RequestParam("reg_name") String name, Model model){
		model.addAttribute(name);
		return "registrantDetails";
	}
	
}