package org.indu.data.dao.impl;

import java.util.Date;

import org.indu.data.dao.TaskDAO;
import org.indu.data.persistence.Task;
import org.indu.data.persistence.TaskDetail;
import org.junit.Assert;
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
	public void initialize(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		this.taskDAO = (TaskDAO)context.getBean("taskJPADAO");
		
		task = new Task();
		task.setTaskTitle("Test My Task Title");
		
		TaskDetail taskDetail = new TaskDetail();
		taskDetail.setCreationDate(new Date());
		taskDetail.setDueDate(new Date());
		taskDetail.setTaskDescription("Test My Task Description");
//		taskDetail.setTask(this.task);
		
		task.setTaskDetail(taskDetail);
	}
	
	@Test
	public void test(){
		this.taskDAO.insert(task);
		Assert.assertNotNull(this.taskDAO.findTask(task.getId()));
		
		this.taskDAO.delete(3);
		Assert.assertNull(this.taskDAO.findTask(3));
	}
}
