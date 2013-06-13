package org.indu.data.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Indu Devanath
 *
 */
@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue
	Integer id;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	

}
