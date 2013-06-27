package org.indu.data.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * JPA Entity class that maps to table "task"
 * @author Indu Devanath
 *
 */
@Entity
@Table(name="task")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(name="task_title", length=20)
	private String taskTitle;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private TaskDetail taskDetail;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTaskTitle() {
		return taskTitle;
	}

	public void setTaskTitle(String taskTitle) {
		this.taskTitle = taskTitle;
	}

	public TaskDetail getTaskDetail() {
		return taskDetail;
	}

	public void setTaskDetail(TaskDetail taskDetail) {
		this.taskDetail = taskDetail;
	}

}
