package my.sunghyuk.lifemusic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Album;
import my.sunghyuk.lifemusic.entity.AlbumEntity;
import my.sunghyuk.lifemusic.repository.AlbumRepository;

@Service("albumService")
public class AlbumServiceImpl implements AlbumService {

	@Autowired
	private AlbumRepository repository;
	
	@Override
	public Album getAlbumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Album> getAllAlbums() {
		List<AlbumEntity> entities = repository.findAll();
		List<Album> albums = new ArrayList<Album>();
		
		for (AlbumEntity entity : entities) {
			albums.add(entity.buildDomain());
		}
		
		return albums;
	}
	
}
