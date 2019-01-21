
DROP SCHEMA IF EXISTS ProjectManagemen;

create database ProjectManagement;

use ProjectManagement;

create table project(
	project_no int(11) auto_increment primary key,
	project_name varchar(255),
	startdate date,
	enddate date,
	progress varchar(20)
);

create table Project_content(
	project_no int(11),
	content text
);