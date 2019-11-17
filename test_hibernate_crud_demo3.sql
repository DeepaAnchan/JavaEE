create table customer1.employee_data(id int(11) primary key auto_increment,
generated_id varchar(255) not null unique,
 first_name varchar(255), last_name varchar(255), email varchar(255));
 
select * from customer1.employee_data;