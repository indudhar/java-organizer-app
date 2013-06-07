package com.indu.controller.forms;

import javax.validation.constraints.Pattern;

/**
 * @author Indu Devanath
 *
 */
public class Registrant {

	@Pattern(regexp="[a-zA-Z'\\s]*",message="Name should have alphabets only.")
	private String regName;

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}
	
}
