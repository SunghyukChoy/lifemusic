package my.sunghyuk.lifemusic.service;

import java.util.List;

import org.slf4j.Logger;

import my.sunghyuk.lifemusic.domain.Album;

public interface AlbumService {
	
	Album getAlbumById(int id);
	List<Album> getAllAlbums();
	void test(Logger logger);
	
}
