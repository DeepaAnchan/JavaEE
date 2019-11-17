create database testdb;
use testdb;

select * from testdb.todo;

drop table testdb.customer;

create table testdb.customer (id integer not null auto_increment, email varchar(255), first_name varchar(255), last_name varchar(255), primary key (id));
create table testdb.todo (id integer not null auto_increment, desc1 varchar(255), isDone bit not null, user varchar(255), primary key (id)) ;

insert into testdb.customer(email,first_name,last_name) values ('asd','asd','asdf');