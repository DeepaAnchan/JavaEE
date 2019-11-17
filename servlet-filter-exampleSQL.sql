CREATE database SERVLET_FILTER;
use servlet_filter;

create table servlet_filter.users(id int primary key, username varchar(255) not null, password varchar(255) not null); 
drop table users;
create table  servlet_filter.todolist(id int primary key, eventname varchar(255), userid int, constraint foreign key(userid) references users(id));
drop table todolist;

desc servlet_filter.users;
desc servlet_filter.todolist;