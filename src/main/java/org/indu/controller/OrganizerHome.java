package org.indu.controller;

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
public class OrganizerHome {

	@RequestMapping({"/","/home","/start"})
	public String startHome(ModelMap model) {
		
		model.addAttribute("message", "Home Page");
		return "start";

	}
}