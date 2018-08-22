
alter table people 
add column birth_city varchar(10); '//this is how you add a new column'

alter table people
drop column birth_city; '//This is how you delete a column'

alter table people
add column birthCity varchar(10) 
after `name`; '//This is how you add a column at a specific position in the table'

alter table people
modify column birthCity varchar(50); '//this is how you modify the column's type'

alter table people
change column birthCity BirthCity varchar(50); '//This is how you rename a collumn (you gotta re-type the column's type)'

alter table peoples
rename to people; '//This is how you rename a table'

create table if not exists games ( '//This is used to make sure that the table does not exist, if it does, the original one gets sent to neather'
	
    `name` varchar(50) not null unique,
    gender varchar(50),
    `review(0-100)` int not null,
    description text,
    released_year year

) default charset = utf8;

alter table games
add column id int not null first;

alter table games
add primary key (id);

alter table games
modify column id int auto_increment not null; '//those 3 are the process of adding a primary_key to an existing table'
