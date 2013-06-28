package org.indu.data.dao;

import org.indu.data.persistence.Task;

/**
 * Work with Task and TaskDetail entities
 * @author Indu Devanath
 *
 */
public interface TaskDAO {

	public void insert(Task task);
	public void update(Task task);
	public void delete(int id);
	public Task findTask(int id);
}
