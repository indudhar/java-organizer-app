package com.indu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Organizer Controller to recieve and service http requests
 * 
 * @author Indu Devanath
 *
 */

@Controller
@RequestMapping("/")
public class OrganizerController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		
		model.addAttribute("message", "Starter App");
		return "start";

	}
	
}