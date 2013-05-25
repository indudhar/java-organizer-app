package com.indu.data.dao.impl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.indu.data.User;
import com.indu.data.dao.UserDAO;
import com.indu.data.persistence.Users;

/**
 * Tests for JPAUserDAO class
 * 
 * @author Indu Devanath
 *
 */
@RunWith(JUnit4ClassRunner.class)
public class JPAUserDAOTest {
	
	UserDAO userDAO;
	User mockUser;
	
	/**
	 * Get the Application Context so you can test the jdbcUserDAO bean.
	 * Note that this test will connect to database as defined in the test resources configuration.
	 * 
	 */
	@Before
	public void initialize(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.userDAO = (UserDAO)context.getBean("jpaUserDAO");
		
		this.mockUser = mock(User.class);
		when(this.mockUser.getId()).thenReturn(1);
		when(this.mockUser.getName()).thenReturn("Lisa");
		when(this.mockUser.getEmail()).thenReturn("lisa@email.com");
	}
	
	@Test
	public void findById(){
		Users user = (Users)this.userDAO.findById(1);
		assertEquals(user.getName(), "indu");
		
	}

}
