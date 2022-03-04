CREATE DATABASE my_db;
USE my_db;

CREATE TABLE login_system_user (
id bigint auto_increment not null,
first_name varchar(35),
last_name varchar(900),
email varchar(40),
password varchar(255),
PRIMARY KEY(id)
);

CREATE TABLE login_system_role (
id bigint auto_increment not null,
name varchar(255),
PRIMARY KEY(id)
);

CREATE TABLE login_system_users_roles (
user_id bigint not null,
role_id bigint not null,
FOREIGN KEY(user_id) REFERENCES login_system_user(id),
FOREIGN KEY(role_id) REFERENCES login_system_role(id),
PRIMARY KEY(user_id, role_id)
);