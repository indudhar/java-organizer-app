package com.indu.data.dao;

import java.util.List;

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
	public boolean delete(Users user);
	public Users findById(int id);
	public List<Users> findByUserName(String userName);

}
