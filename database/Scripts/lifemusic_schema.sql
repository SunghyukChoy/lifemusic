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
    like_count INT UNSIGNED NOT NULL DEFAULT 0,
	created_datetime timestamp not null default now(),
	updated_datetime timestamp not null default now(),
	primary key(id)
);

CREATE TABLE `categories` (
	`id` BIGINT NOT NULL AUTO_INCREMENT,
	`type` ENUM('NONE','GENRE') NULL DEFAULT NULL,
	`name` VARCHAR(50) NOT NULL DEFAULT '',
	`parent_id` BIGINT NULL DEFAULT NULL,
	`description` VARCHAR(200) NULL DEFAULT NULL,
	created_datetime timestamp not null default now(),
	updated_datetime timestamp not null default now(),
	PRIMARY KEY (`id`),
	INDEX `INDEX_PARENT_ID` (`type`) USING BTREE
);

CREATE TABLE `album_tracks` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(80) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `album_id` bigint NOT NULL DEFAULT '0',
  `track_no` int NOT NULL DEFAULT '0',
  `song_id` bigint NOT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
);

CREATE TABLE `songs` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `composer_name` varchar(100) DEFAULT NULL,
  `lyricist_name` varchar(100) DEFAULT NULL,
  `singer_id` bigint DEFAULT NULL,
  `created_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_datetime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `lyrics_id` bigint NOT NULL DEFAULT '1',
  `running_time` time NOT NULL DEFAULT '00:00:00',
  PRIMARY KEY (`id`)
);