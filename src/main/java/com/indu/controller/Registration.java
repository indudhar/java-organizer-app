package com.indu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indu.controller.forms.Registrant;

/**
 * @author Indu Devanath
 *
 */
@Controller
@RequestMapping("/new_registration")
public class Registration {
	
	@RequestMapping(method=RequestMethod.GET)
	public String createRegForm(Model model){
		model.addAttribute(new Registrant());
		return "newRegister";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addRegistrant(@Valid Registrant registrant, BindingResult result, Model model){
		model.addAttribute("registrant",registrant);
		return "registrantDetails";
	}

}
