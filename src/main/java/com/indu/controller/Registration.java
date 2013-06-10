package com.indu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indu.controller.forms.Registrant;
import com.indu.data.dao.UsersDAO;
import com.indu.data.persistence.Users;

/**
 * @author Indu Devanath
 *
 */
@Controller
@RequestMapping("/registration")
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
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public String showSearchResult(@PathVariable Long id, Model model){
		Users users = this.usersDAO.findById(id.intValue());
		model.addAttribute("user", users);
		return "searchResult";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String search(Model model){
		model.addAttribute(new Registrant());
		return "searchRegistrant";
	}
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public String search(@Valid Registrant registrant, BindingResult result){
		if(result.hasErrors()){
			return "searchRegistrant";
		}
		return "redirect:/registration/"+registrant.getId();
	}

}
