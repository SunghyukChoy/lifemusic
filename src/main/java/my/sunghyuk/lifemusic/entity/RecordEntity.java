package my.sunghyuk.lifemusic.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import my.sunghyuk.lifemusic.domain.Record;

// TODO: Change to LOMBOK
public class RecordEntity {
	
	private long id;
	private String name;
	private String description;
	private String imgURL;
	private String artist;
	private LocalDate releaseDate;
	private String writer;
	private int likeCount;
	private LocalDateTime createdDateTime;
	private int views;
	private double rate;
	

	public RecordEntity(long id, String name, String description, String imgURL, String artist, LocalDate releaseDate,
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
	
	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public LocalDateTime getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(LocalDateTime createdDateTime) {
		this.createdDateTime = createdDateTime;
	}	

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}	

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Record buildDomain() {
		Record record = new Record();
		record.setId(id);
		record.setName(name);
		record.setDescription(description);
		record.setImgURL(imgURL);
		record.setArtist(artist);
		record.setReleaseDate(releaseDate);
		record.setWriter(writer);
		record.setCreatedDateTime(createdDateTime);
		record.setLikeCount(likeCount);
		record.setViews(views);
		record.setRate(rate);
		return record;
	}
	
	public void buildEntity(Record record) {
		this.id = record.getId();
		this.name = record.getName();
		this.description = record.getDescription();
		this.imgURL = record.getImgURL();
		this.artist = record.getArtist();
		this.releaseDate = record.getReleaseDate();
		this.writer = record.getWriter();
		this.createdDateTime = record.getCreatedDateTime();
		this.likeCount = record.getLikeCount();
		this.views = record.getViews();
		this.rate = record.getRate();
	}
}
