package my.sunghyuk.lifemusic.common;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import my.sunghyuk.lifemusic.entity.Album;

public class DummyHelper {
	public static List<Album> GetDummyAlbums() {
		
		ArrayList<Album> albums = new ArrayList<Album>();
		
		albums.add(new Album(1, "The Stand-In", "", "/imgs/sample/albumcover1.jpg", "Caitlin Rose", LocalDate.of(2015, 1, 23), "Choi"));
		albums.add(new Album(2, "The 1975", "", "/imgs/sample/albumcover2.jpg", "The 1975", LocalDate.of(2014, 1, 21), "Seon"));
		albums.add(new Album(3, "Love Is Dead", "", "/imgs/sample/albumcover3.jpg", "CHVRCHES", LocalDate.of(2016, 11, 22), "Lee"));
		
		return albums;
	}
}
