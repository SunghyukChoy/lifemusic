package my.sunghyuk.lifemusic.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.AlbumEntity;
import my.sunghyuk.lifemusic.entity.mapper.AlbumMapper;

@Repository("albumRepository")
public class AlbumRepositoryMyBatis implements AlbumRepository {

	@Autowired
	private AlbumMapper mapper;		// MyBatis 핵심 부분
	
	@Override
	public AlbumEntity findOne(long id) {
		return mapper.findById(id);
	}

	@Override
	public List<AlbumEntity> findAll() {
		return mapper.findAll();
	}

}
