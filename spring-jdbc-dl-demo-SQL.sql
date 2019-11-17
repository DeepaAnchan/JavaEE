USE CUSTOMER;
show tables;
desc customer_spring_table;

create table customer_spring_table(id int primary key, firstName varchar(255), lastName varchar(255),
email varchar(255));

alter table customer.customer_spring_table modify id int auto_increment;

select * from customer.customer_spring_table;