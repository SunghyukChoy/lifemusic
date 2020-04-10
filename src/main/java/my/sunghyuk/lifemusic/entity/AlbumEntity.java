package my.sunghyuk.lifemusic.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import my.sunghyuk.lifemusic.domain.Album;

public class AlbumEntity {
	
	private long id;
	private String name;
	private String description;
	private String imgURL;
	private String artist;
	private LocalDate releaseDate;
	private String writer;
	private LocalDateTime createdDateTime;

	public AlbumEntity(long id, String name, String description, String imgURL, String artist, LocalDate releaseDate,
			String writer) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.imgURL = imgURL;
		this.artist = artist;
		this.releaseDate = releaseDate;
		this.writer = writer;
	}

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

	public LocalDate getReleasedDate() {
		return releaseDate;
	}

	public void setReleasedDate(LocalDate releasedDate) {
		this.releaseDate = releasedDate;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Album buildDomain() {
		Album album = new Album();
		album.setId(id);
		album.setName(name);
		album.setDescription(description);
		album.setImgURL(imgURL);
		album.setArtist(artist);
		album.setReleaseDate(releaseDate);
		album.setWriter(writer);
		album.setCreatedDateTime(createdDateTime);
		return album;
	}
	
	public void buildEntity(Album album) {
		this.id = album.getId();
		this.name = album.getName();
		this.description = album.getDescription();
		this.imgURL = album.getImgURL();
		this.artist = album.getArtist();
		this.releaseDate = album.getReleaseDate();
		this.writer = album.getWriter();
		this.createdDateTime = album.getCreatedDateTime();
	}
}
