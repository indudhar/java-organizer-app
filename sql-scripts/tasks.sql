
CREATE TABLE task(
	id SERIAL,
	task_title VARCHAR(20) NOT NULL,
	CONSTRAINT task_pk PRIMARY KEY (id)
);

CREATE TABLE task_detail(
	id SERIAL,
	task_id INTEGER,
	task_description VARCHAR(400),
	creation_date DATE NOT NULL,
	due_date DATE NOT NULL,
	CONSTRAINT task_detail_pk PRIMARY KEY (id),
	CONSTRAINT task_detail_fk FOREIGN KEY (task_id) REFERENCES task(id) ON DELETE CASCADE
);