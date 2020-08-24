create database elearning;

use elearning;

create table registration (
id int primary key auto_increment,
rname nvarchar(255)not null,
runame nvarchar(255)not null,
remail nvarchar(255)not null,
rcontact nvarchar(255)not null,
rpassword nvarchar(255)not null,
rcpassword nvarchar(255)not null
);
 
create table adminreg(
id int primary key auto_increment,
adminuname nvarchar(255) not null,
adminpass nvarchar(255) not null
);

create table contactus(
id int primary key auto_increment,
fname nvarchar(255),
email nvarchar(255),
message nvarchar(255)
);

create table course(
cid int primary key auto_increment,
cname nvarchar(255),
cauthor nvarchar(255),
cdescription nvarchar(255),
curl nvarchar(255),
cimgname nvarchar(255),
cimgpath nvarchar(255)
); 

select * from registration;
select * from adminreg;
select * from contactus;
select * from course;

insert into adminreg(adminuname,adminpass) values("admin1","1234"); 

select * from registration where runame="sushil1050";
select * from course where cid=7;
-- select runame,rpassword from registration where runame='Sushil1050' and rpassword='12345';
-- drop table registration; 
-- drop table contactus;
