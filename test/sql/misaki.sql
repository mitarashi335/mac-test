set names utf8;
set foreign_key_checks=0;

drop database if exists orion;
create database if not exists orion;

use orion;

create table user_info(
	id int not null primary key auto_increment comment "ID",
	user_id varchar(16) unique not null comment "ユーザーID",
	password varchar(16) not null comment "パスワード",
	family_name varchar(32) not null comment "姓",
	first_name varchar(32) not null comment "名",
	family_name_kana varchar(32) not null comment "姓かな",
	first_name_kana varchar(32) not null comment "名かな",
	sex tinyint default 0 comment "性別",
	email varchar(32) comment "メールアドレス",
	status tinyint default 0 comment "ステータス",
	logined tinyint not null default 0 comment "ログインフラグ",
	regist_date datetime comment "登録日",
	update_date datetime comment "更新日"
)
