package my.sunghyuk.lifemusic.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.AlbumEntity;
import my.sunghyuk.lifemusic.entity.mapper.AlbumMapper;

@Repository("albumRepository")
public class AlbumRepositoryMyBatis implements AlbumRepository {

	@Autowired
	private AlbumMapper mapper;
	
	@Override
	public AlbumEntity findOne(AlbumEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlbumEntity> findAll() {
		return mapper.findAll();
	}

}
