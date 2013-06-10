package com.indu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indu.controller.forms.Registrant;
import com.indu.data.dao.UsersDAO;

/**
 * @author Indu Devanath
 *
 */
@Controller
@RequestMapping("/new_registration")
public class Registration {
	
	@Autowired
	private UsersDAO usersDAO;
	
	@RequestMapping(method=RequestMethod.GET)
	public String createRegForm(Model model){
		model.addAttribute(new Registrant());
		return "newRegister";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addRegistrant(@Valid Registrant registrant, BindingResult result, Model model){
		if(result.hasErrors()){
			return "newRegister";
		}
		model.addAttribute("registrant",registrant);
		return "registrantDetails";
	}

}
