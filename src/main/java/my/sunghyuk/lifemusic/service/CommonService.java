package my.sunghyuk.lifemusic.service;

import java.util.List;

import my.sunghyuk.lifemusic.domain.Genre;

public interface CommonService {

	List<Genre> getGenres(String keywords);
	
}
