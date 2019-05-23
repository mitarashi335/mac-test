set names utf8;
set foreign_key_checks=0;

drop database if exists code_breaker;
create database if not exists code_breaker;

use code_breaker;

create table ranking_info(
	id int not null primary key auto_increment,
	name varchar(32) not null,
	count int not null
);

insert into ranking_info values
(1,"guest",5);