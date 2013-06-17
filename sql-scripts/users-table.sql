CREATE TABLE users (
	id SERIAL,
	user_name VARCHAR(20) NOT NULL,
	email VARCHAR(30) NOT NULL,
	CONSTRAINT users_pk PRIMARY KEY (id)
);

CREATE TABLE user_details(
	id serial,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	users_id INTEGER,
	CONSTRAINT pk_user_details PRIMARY KEY (id),
	CONSTRAINT fk_user_details FOREIGN KEY (users_id) REFERENCES users(id) on delete cascade
);