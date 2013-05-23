package com.indu.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;

@Controller
@RequestMapping("/")
public class OrganizerController {

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Starter App");
		return "start";

	}
	
	public boolean testingJDBC(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDAO userDAO = (UserDAO)context.getBean("jdbcUserDAO");
		User user = userDAO.findById(1);
		System.out.println(user.getEmail());
		return true;
	}
	
}