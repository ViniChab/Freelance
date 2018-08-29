create database cadastro //use this to create a database
default character set utf8 //use this to add the utf8 charset
default collate utf8_general_ci; 

create table people( //this is how you create a table

	id int not null auto_increment,  '//auto_increment will increment the id: each time a new person is registered'
	`name` varchar(100) not null,  '//not null will make this a obligatory field'
	birth date,  '//date is a type that accepts.... dates'
	sex enum('M','F'),   '//enum will limitate the field to onlly accepting the "M" or "F"'
	weight decimal (5,2),  '//five numbers, in wich 2 are after the comma'
	height decimal(3,2),  
	nacionality varchar(20) default 'Brazil',  '//varchar will limitate the value of this char to 20, but if the char does not fill all those spaces, the ones that are left out will not be kept. Default will put 'Brazil' in the field, if it does not recieve any input'
	primary key(id)  '//this will not allow two identical IDs'

) default charset = utf8;  '//add the charset to the table'

select * from (table names) '//this command will show you the table'

show databases '//this command will show all the databases'

show tables '//this command will show all the tables of a selected database'

use (database name) '//this command will choose a specific database'

drop table/database (table/database name) '//this command will destroy a table/database and send it to the nether world, where it will suffer for the rest of the eternity'

insert into people '//this is how you add to the table'
(`name`, birth, sex, weight, height, nacionality)
values
('Jack', '1998-02-08', 'M', '75.6', '1.81', 'Brasil'); '//all the data between '' '


insert into people '//if you dont use all of the parameters, it will use defalt where it can, and where there is no defalt defined, it'll just appear a NULL'
(`name`, sex, weight, height)
values
('Maria', 'F', '55.3', '1.63'); '//it will fail if you dont add a 'not null' component, or repeat the ID'

insert into people values
(default, 'Maucílio', '1995-04-12', 'M', '81.3', '1.93', default); 
'// you can also do it like this, but all the info is needed, and in order'
