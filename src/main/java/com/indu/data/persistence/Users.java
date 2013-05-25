package com.indu.data.persistence;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * This is JPA Entity Persistence class
 * 
 * @author Indu Devanath
 *
 */
@Entity
@Table(name="users")
public class Users implements Serializable{

	private static final long serialVersionUID = -3260501382177368299L;
	
	private Integer id;
	private String name;
	private String email;
	private Set<UserDetails> userDetails;
	
	
	/**
	 * @param id the id to set
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public void setId(Integer id) {
		this.id = id;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	@Column(name="user_name")
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	@Column(name="email")
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the userDetails
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "users_id", nullable = false)
	public Set<UserDetails> getUserDetails() {
		return userDetails;
	}

	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(Set<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}

}
