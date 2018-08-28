
    alter table people
    add foreign key (favoriteGame)
    references favoritegame(id); '//this is how you add a foreign key'
    
    update people set favoritegame = '1' where id='3'; '//this is how you add a conection, but its better to do it by click'
    
    select people.`name`, favoritegame.gamename from people join favoritegame
    on favoritegame.id = people.favoritegame
    order by people.`name`; '//Inner join example'
    
    
    select people.`name`, favoritegame.gamename from people left outer join favoritegame
    on favoritegame.id = people.favoritegame
    order by people.`name`; '//Left outer join example'
    
    
    select people.`name`, favoritegame.gamename from people right outer join favoritegame
    on favoritegame.id = people.favoritegame
    order by people.`name`; '//Right outer join example'
    
    alter table people
    add column playingRightNow int;
    
    alter table people
    add foreign key (playingRightNow)
    references games(id);
    
    alter table people
    drop column playingrightnow;
    
    create table if not exists p_play_g(
    
    playingRightNow int,
    playedby int
    
    ) default charset = utf8; '//This is how you add a n - n conection'
    
    alter table p_play_g
    add foreign key(playingRightNow)
    references games(id);
    
    
    alter table p_play_g
    add foreign key(playedBy)
    references people(id);
		
	alter table p_play_g
	add primary key (id);

	alter table p_play_g
	modify column id int auto_increment not null;
		
	insert into p_play_g
    (playingRightNow, playedBy)
    value
    ('1','2'); '//1 is plaring right now, 2...'
		
	select * from p_play_g;
    
    select people.`name`, games.`name` from people join games
    on games.id = people.id
    order by people.`name`;
    
    select  people.`name`, games.`name`, favoritegame.gameName from people
    join p_play_g
    on people.id  = p_play_g.playingRightNow
    join games
    on games.id= p_play_g.playedby
    join favoritegame
    on people.id = favoritegame.id
    order by people.`name`; '//ohh complex'
    
