package my.sunghyuk.lifemusic.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.entity.AlbumEntity;

@Repository("albumRepository")
public class AlbumRepositoryDummy implements AlbumRepository {

	@Override
	public AlbumEntity findOne(AlbumEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlbumEntity> findAll() {
		ArrayList<AlbumEntity> albums = new ArrayList<AlbumEntity>();
		
		albums.add(new AlbumEntity(1, "The Stand-In", "", "/imgs/sample/albumcover1.jpg", "Caitlin Rose", LocalDate.of(2015, 1, 23), "Choi"));
		albums.add(new AlbumEntity(2, "The 1975", "", "/imgs/sample/albumcover2.jpg", "The 1975", LocalDate.of(2014, 1, 21), "Seon"));
		albums.add(new AlbumEntity(3, "Love Is Dead", "", "/imgs/sample/albumcover3.jpg", "CHVRCHES", LocalDate.of(2016, 11, 22), "Lee"));
		
		return albums;
	}

}
