set names utf8;
set foreign_key_checks=0;

drop database if exists logindb13;
create database if not exists logindb13;
use logindb13;

drop table if exists abcd;
create table abcd(
id int,
user_name varchar(255),
password varchar(255)
);

insert into abcd VALUES(1,"sasako","335");
insert into abcd VALUES(2,"sasadate","159");
insert into abcd VALUES(3,"sasaki","753");