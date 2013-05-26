package com.indu.data.dao;

import com.indu.data.persistence.Users;


/**
 * DAO interface for table 'users'
 * 
 * @author Indu Devanath
 *
 */
public interface UsersDAO {
	
	public boolean insert(Users user);
	public boolean update(Users user);
	public boolean deleteById(int id);
	public Users findById(int id);
	public Users findByUserName(String userName);

}
