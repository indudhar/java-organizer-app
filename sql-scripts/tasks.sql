
CREATE TABLE task(
	id SERIAL,
	detail_id INTEGER,
	task_title VARCHAR(20) NOT NULL,
	CONSTRAINT task_pk PRIMARY KEY (id),
	CONSTRAINT task_fk FOREIGN KEY (detail_id) REFERENCES task_detail(id) ON DELETE CASCADE
);

CREATE TABLE task_detail(
	id SERIAL,
	task_description VARCHAR(400),
	creation_date DATE NOT NULL,
	due_date DATE NOT NULL,
	CONSTRAINT task_detail_pk PRIMARY KEY (id),
);