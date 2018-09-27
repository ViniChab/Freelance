
update people
set `name` = 'Bastion'
where id = '3'; '//This is how you change something from a line inside a table'

delete from people where id='5'; '//This deletes a line'

truncate table (table name); '//this destroys all information inside a table, but does not delete the table strucutre'

select * from people '//Assim que ordena'
order by `name`;

select * from people '//Assim que ordena de trás pra frente'
order by `name` desc;

select `name`, birth, height, weight from people; '//This only show a few things'


select * from people 
order by nacionality, birth; //it'll order by birth inside the same nacionalities, wich are also ordered'


select * from people 
where nacionality = 'Brazil'
order by birth; ''//It'll order bt birth showing only those born in brazil'

select `name`, weight from people 
where weight > 70
order by weight; '//You can use operators like this'

select * from people
where birth between '1990-01-01' and '1999-12-12'
order by birth desc; '//between and and (haha)'

select * from people
where nacionality in ('German', 'Japanese', 'Italian','Russian','American')
order by `name`; '//in is a method of only showind a specific parameter'

select * from people
where birth between '1990-01-01' and '1999-12-12' and weight > '77'
order by `name`; '//using logical operators'

select * from people
where `name` like 'M%'
order by `name`; '//% is wildcard any, that menas its looking for a word thats starts with M and has anything after it (even nothing)'

select * from people
where `name` not like '%m%'; '//m is somewhere inside the word'


select * from people
where `name` like 'a%r_'; 'the underline wildcard means that there IS a character in that position'

select distinct nacionality from people;

select count(`name`) from people
where `name` = 'maria'; '//counts how many times the name maria shows up'

select max(weight) from people; '//shouws the bigger weight, also applies to min'

select sum(height) from people; '//makes the sum of all heights'

select avg(height) from people; '//calculaes the average value of the heights'
