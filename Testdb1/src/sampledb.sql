drop database if exists sampledb1;
create database sampledb1;
use sampledb1;

create table sample_table1(
No int,name varchar(50),age int,Mail varchar(50));

insert into sample_table1 values(1,"Yamada",21,"xxx@yahoo.co.jp");
insert into sample_table1 values(2,"Sato",39,"yyy@google.com");
insert into sample_table1 values(3,"Harada",44,"zzz@yahoo.co.jp");

