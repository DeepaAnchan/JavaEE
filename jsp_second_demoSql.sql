create database customer;
use customer;

create table customer_table(id int primary key auto_increment, 
	first_name varchar(255), last_name varchar(255), email varchar(255));
    
insert into customer_table(first_name, last_name, email) values("Ram","laal","ramz@123@gmail.com");

select * from customer_table;


drop table customer_table;
show tables;