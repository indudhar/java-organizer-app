package org.indu.data.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.indu.data.dao.TaskDAO;
import org.indu.data.persistence.Task;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="taskJPADAO")
@Transactional
public class TaskJPADAO implements TaskDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Task task) {
		this.entityManager.persist(task);
	}

	
	public void update(Task task) {
		// TODO Auto-generated method stub
		
	}

	
	public void delete(int id) {
		Task task = this.entityManager.find(Task.class, id);
		this.entityManager.remove(task);
	}

	
	public Task findTask(int id) {
		return this.entityManager.find(Task.class, id);
	}

}
