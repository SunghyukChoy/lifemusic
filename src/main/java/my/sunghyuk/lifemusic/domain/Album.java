package my.sunghyuk.lifemusic.domain;

import java.time.LocalDate;

public class Album {

	private int id;
	private String name;
	private String description;
	private String imgURL;
	private String artist;
	private LocalDate releasedDate;
	private String writer;

	public Album() {
	}

	public Album(int id, String name, String description, String imgURL, String artist, LocalDate releasedDate, String writer) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imgURL = imgURL;
		this.artist = artist;
		this.releasedDate = releasedDate;
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public LocalDate getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(LocalDate releasedDate) {
		this.releasedDate = releasedDate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}