USE lifemusic;

-- lifemusic.albums
CREATE TABLE albums (
	id bigint not null auto_increment,
	name varchar(50) not null,
	description varchar(120) null default '',
	img_url varchar(200) null,
	artist varchar(30) not null,
	release_date timestamp null,
	writer varchar(20) not null,
	created_datetime timestamp not null default now(),
	updated_datetime timestamp not null default now(),
	primary key(id)
);

-- add dummy data
insert into albums (name, img_url, artist, release_date, writer) values ('The Stand-In', '/imgs/sample/albumcover1.jpg', 'Caitlin Rose', '2013-03-05', 'Choi');
insert into albums (name, img_url, artist, release_date, writer) values ('The 1975', '/imgs/sample/albumcover2.jpg', 'The 1975', '2013-09-02', 'Choi');
insert into albums (name, img_url, artist, release_date, writer) values ('Love Is Dead', '/imgs/sample/albumcover3.jpg', 'CHVRCHES', '2018-05-25', 'Choi');
