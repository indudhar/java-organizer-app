package org.indu.controller.forms;

import javax.validation.constraints.Pattern;

/**
 * @author Indu Devanath
 *
 */
public class Registrant {
	
	@Pattern(regexp="[a-zA-Z'\\s]*",message="Name should have alphabets only.")
	private String regName;
	
	@Pattern(regexp="[\\d]*",message="Please enter a number")
	private String id;

	public String getRegName() {
		return regName;
	}

	public void setRegName(String regName) {
		this.regName = regName;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	
}
