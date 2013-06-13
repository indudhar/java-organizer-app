package org.indu.data.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.indu.data.dao.UsersDAO;
import org.indu.data.persistence.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * JPA Implementation for working with User tables
 * 
 * @author Indu Devanath
 *
 */
@Repository(value="jpaUserDAO")
@Transactional
public class JPAUsersDAO implements UsersDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	

	/* (non-Javadoc)
	 * @see org.indu.data.dao.UserDAO#insert(org.indu.data.User)
	 */
	@Override
	public boolean insert(Users user) {
		em.persist(user);
		return true;
	}

	/* (non-Javadoc)
	 * @see org.indu.data.dao.UserDAO#update(org.indu.data.User)
	 */
	@Override
	public boolean update(Users user) {
		em.merge(user);
		return true;
	}

	public boolean delete(Users user){
		this.em.remove(user);
		return true;
	}

	/* (non-Javadoc)
	 * @see org.indu.data.dao.UserDAO#deleteById(int)
	 */
	@Override
	public boolean deleteById(int id) {
		Users user = findById(id);
		delete(user);
		return true;
	}
	
	/* (non-Javadoc)
	 * @see org.indu.data.dao.UserDAO#findById(int)
	 */
	@Override
	public Users findById(int id) {
		return em.find(Users.class, id);
	}

	/* (non-Javadoc)
	 * @see org.indu.data.dao.UserDAO#findByUserName(java.lang.String)
	 */
	@Override
	public List<Users> findByUserName(String userName) {
		return this.em.createQuery("select u from Users u where u.name = :searchName").setParameter("searchName", userName).getResultList();
	}

}
