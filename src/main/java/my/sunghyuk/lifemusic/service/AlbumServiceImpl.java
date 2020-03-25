package my.sunghyuk.lifemusic.service;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Album;

@Service("albumService")
public class AlbumServiceImpl implements AlbumService {

	@Override
	public Album getAlbumById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Album> getAllAlbums() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void test(Logger logger) {
		logger.error("테스트 메서드");
	}

}
