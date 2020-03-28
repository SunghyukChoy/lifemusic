package my.sunghyuk.lifemusic.domain;

import java.time.LocalDate;
import java.util.List;

public class Album {

	private long id;
	private String name;
	private String description;
	private String imgURL;
	private String artist;
	private LocalDate releaseDate;
	private String writer;
	private List<Genre> genres;
	private String genreNames;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public String getGenreNames() {
		if (genreNames == null) {
			genreNames = "";
			
			for (int i = 0; i < genres.size(); i++) {
				Genre genre = genres.get(i);
				genreNames += genre.getName() + (i == genres.size() ? "" : ", ");
			}
		}
		
		return genreNames;
	}

}