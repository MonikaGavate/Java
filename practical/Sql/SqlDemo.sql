use monika;	

create table student(
 id int primary key not null,
 name varchar(30) not null,
 address varchar(40) not null
 );
 
 desc student;
 
 select * from student;

insert into student values(1,'monika','pune');
insert into student values(2,'Anuja','pune(uruli)');
insert into student values(3,'Akash','Hadapsar');

 select * from student;