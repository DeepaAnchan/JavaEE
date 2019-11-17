select * from customer1.instructor;
select * from customer1.instructor_Detail;
select * from customer1.course;
select * from customer1.review;
select * from customer1.student;
select * from customer1.course_student;

show tables from customer1;

drop table customer1.instructor;
drop table customer1.instructor_detail;
drop table customer1.course;
drop table customer1.review;
drop table customer1.student;
drop table customer1.course_student;

desc customer1.instructor;
desc customer1.instructor_detail;

delete from customer1.instructor where id=5;
delete from customer1.instructor_detail where id=5;
delete from customer1.course where instructor_id=6;


