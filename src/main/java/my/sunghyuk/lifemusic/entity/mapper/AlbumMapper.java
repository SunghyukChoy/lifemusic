package my.sunghyuk.lifemusic.entity.mapper;

import java.util.List;

import my.sunghyuk.lifemusic.entity.AlbumEntity;

public interface AlbumMapper {
	
	List<AlbumEntity> findAll();
	AlbumEntity findById(long id);
	
}
