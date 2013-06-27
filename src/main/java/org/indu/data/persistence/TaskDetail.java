package org.indu.data.persistence;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

/**
 * JPA entity class for that maps to table "task_detail"
 * @author Indu Devanath
 *
 */
public class TaskDetail {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name="task_description", length=400)
	private String taskDescription;
	
	@Column(name="creation_date")
	private Date creationDate;
	
	@Column(name="due_date")
	private Date dueDate;
	
	@MapsId
	@OneToOne
	@JoinColumn(name="id")
	private Task task;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskDescription() {
		return taskDescription;
	}

	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
}
