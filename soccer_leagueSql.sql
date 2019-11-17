create database soccer_database;
use soccer_database;
create table soccer_table(id int primary key auto_increment, year int not null, season varchar(255) not null);
select * from soccer_table;

show tables;
desc soccer_table;

drop table soccer_table;

alter table soccer_table add title varchar(255) not null;
alter table soccer_table add gen_id varchar(255) not null;