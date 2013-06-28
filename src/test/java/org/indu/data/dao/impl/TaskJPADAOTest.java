package org.indu.data.dao.impl;

import java.sql.Date;

import org.indu.data.dao.TaskDAO;
import org.indu.data.persistence.Task;
import org.indu.data.persistence.TaskDetail;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Testing TaskJPADAO implementation
 * @author Indu Devanath
 *
 */
@RunWith(JUnit4ClassRunner.class)
public class TaskJPADAOTest {
	
	private TaskDAO taskDAO;
	private Task task;
	
	@Before
	private void initialize(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.taskDAO = (TaskDAO)context.getBean("taskJPADAO");
		
		task = new Task();
		task.setTaskTitle("Test My Task Title");
		
		TaskDetail taskDetail = new TaskDetail();
		taskDetail.setCreationDate(new Date(1000));
		taskDetail.setDueDate(new Date(1000));
		taskDetail.setTaskDescription("Test My Task Description");
		
		task.setTaskDetail(taskDetail);
	}
	
	@Test
	private void testInsert(){
		this.taskDAO.insert(task);
		//check database for insert
	}
}
