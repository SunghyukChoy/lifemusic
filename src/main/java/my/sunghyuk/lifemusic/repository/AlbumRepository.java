package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.AlbumEntity;

public interface AlbumRepository {
	
	AlbumEntity findOne(AlbumEntity entity);
	List<AlbumEntity> findAll();
	
}
