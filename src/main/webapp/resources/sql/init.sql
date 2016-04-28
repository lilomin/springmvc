CREATE TABLE users (
	id int NOT NULL AUTO_INCREMENT,
	name varchar(20) DEFAULT NULL,
	age int DEFAULT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB CHARSET=utf8
CREATE TABLE blogs (
	id int NOT NULL AUTO_INCREMENT,
	tilte varchar(200) NOT NULL,
	content text DEFAULT NULL,
	create_time DATE NOT NULL,
	PRIMARY KEY (id)
)ENGINE=InnoDB CHARSET=utf8
CREATE TABLE commonts (
	id int NOT NULL AUTO_INCREMENT,
	commont varchar(100) NOT NULL,
	users_id int NOT NULL,
	blogs_id int NOT NULL,
	PRIMARY KEY (id),
	FOREIGN KEY (users_id) REFERENCES users(id) ON DELETE CASCADE,
	FOREIGN KEY (blogs_id) REFERENCES blogs(id) ON DELETE CASCADE
)ENGINE=InnoDB CHARSET=utf8