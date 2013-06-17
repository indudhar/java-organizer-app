
CREATE TABLE tasks(
	id SERIAL,
	task_title VARCHAR(20) NOT NULL,
	CONSTRAINT tasks_pk PRIMARY KEY (id)
);

CREATE TABLE task_details(
	id SERIAL,
	tasks_id INTEGER,
	task_description VARCHAR(400),
	creation_date DATE NOT NULL,
	due_date DATE NOT NULL,
	CONSTRAINT task_details_pk PRIMARY KEY (id),
	CONSTRAINT task_details_fk FOREIGN KEY (tasks_id) REFERENCES tasks(id) ON DELETE CASCADE
);