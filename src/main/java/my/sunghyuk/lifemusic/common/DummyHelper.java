package my.sunghyuk.lifemusic.common;

import java.util.ArrayList;
import java.util.List;

import my.sunghyuk.lifemusic.entity.Album;

public class DummyHelper {
	public static List<Album> GetDummyAlbums() {
		
		ArrayList<Album> albums = new ArrayList<Album>();
		
		albums.add(new Album(1, "The Stand-In", ""));
		albums.add(new Album(2, "The 1975", ""));
		albums.add(new Album(3, "Love Is Dead", ""));
		
		return albums;
	}
}
