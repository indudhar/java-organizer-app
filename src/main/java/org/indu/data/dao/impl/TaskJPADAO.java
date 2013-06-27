package org.indu.data.dao.impl;

import org.indu.data.dao.TaskDAO;
import org.indu.data.persistence.Task;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="taskJPADAO")
@Transactional
public class TaskJPADAO implements TaskDAO{

	
	public void insert(Task task) {
		// TODO Auto-generated method stub
		
	}

	
	public void update(Task task) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(Task task) {
		// TODO Auto-generated method stub
		
	}

	
	public Task findTask(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
