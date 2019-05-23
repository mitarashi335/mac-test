set names utf8;
set foreign_key_checks=0;
drop database if exists ecsite;

create database if not exists ecsite;
use ecsite;

drop table if exists login_user_transaction;

create table login_user_transaction(
	id int not null primary key auto_increment,
	user_id varchar(255)unique,
	user_name varchar(255),
	user_pass varchar(255),
	insert_date datetime,
	update_date datetime
);


drop table if exists sell_item_transaction;

create table sell_item_transaction(
	id int not null primary key auto_increment,
	item_name varchar(255),
	item_price int,
	item_stock int,
	insert_date datetime,
	update_date datetime
);


drop table if exists user_buy_item_transaction;

create table user_buy_item_transaction(
	id int not null primary key auto_increment,
	item_id int,
	total_price int,
	total_stock int,
	user_master_id varchar(16),
	pay varchar(30),
	insert_date datetime,
	delete_date datetime
);



