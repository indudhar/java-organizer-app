package com.indu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Organizer Controller to recieve and service http requests
 * 
 * @author Indu Devanath
 *
 */

@Controller
public class OrganizerController {

	@RequestMapping({"/","/home","/start"})
	public String printWelcome(ModelMap model) {
		
		model.addAttribute("message", "Starter App");
		return "start";

	}
	
}