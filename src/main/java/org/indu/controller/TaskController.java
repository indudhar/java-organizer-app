package org.indu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller to handle all the requests arising from the /task/ url
 * 
 * @author Indu Devanath
 *
 */
@Controller
@RequestMapping("/tasks")
public class TaskController {
	
	@RequestMapping(value="/new", method=RequestMethod.GET)
	public String createNewTaskForm(Model model){
		return "tasks/newTask";
	}

}
