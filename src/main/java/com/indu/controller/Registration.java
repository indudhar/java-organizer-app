package com.indu.controller;

import java.util.List;

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
	
	@RequestMapping(value="/id/{id}", method=RequestMethod.GET)
	public String showSearchResultById(@PathVariable Long id, Model model){
		Users users = this.usersDAO.findById(id.intValue());
		model.addAttribute("user", users);
		return "searchResultById";
	}
	
	@RequestMapping(value="/name/{name}", method=RequestMethod.GET)
	public String showSearchResultByName(@PathVariable String name, Model model){
		List<Users> userList = this.usersDAO.findByUserName(name);
		model.addAttribute("userList", userList);
		return "searchResultByName";
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
		if(registrant.getId()!=null && registrant.getId().length()>0 && Long.parseLong(registrant.getId())>0){
			return "redirect:/registration/id/"+registrant.getId();
		}else{
			return "redirect:/registration/name/"+registrant.getRegName();
		}
		
	}

}
