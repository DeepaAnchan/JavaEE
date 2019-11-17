select * from customer1.instructor;
select * from customer1.instructor_Detail;
select * from customer1.course;

show tables from customer1;

drop table customer1.instructor;
drop table customer1.instructor_detail;
drop table customer1.course;

desc customer1.instructor;
desc customer1.instructor_detail;

delete from customer1.instructor where id=5;
delete from customer1.instructor_detail where id=5;
delete from customer1.course where instructor_id=6;


