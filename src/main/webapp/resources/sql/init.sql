CREATE TABLE user (
	id int(11) PRIMARY-KEY NOT NULL AUTO_INCREMENT,
	name varchar(20) DEFAULT NULL,
	age int(11) DEFAULT NULL
)
CREATE TABLE blogs (
	id int(11) PRIMARY-KEY NOT NULL AUTO_INCREMENT,
	tilte varchar(200) NOT NULL,
	content text DEFAULT NULL,
	create_time DATE NOT NULL
)
CREATE TABLE commonts (
	id int(11) PRIMARY-KEY NOT NULL AUTO_INCREMENT,
	commont varchar(100) NOT NULL,
	blog_id int(11) NOT NULL,
	user_id int(11) NOT NULL
)