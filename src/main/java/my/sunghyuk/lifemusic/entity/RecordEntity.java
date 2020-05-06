package my.sunghyuk.lifemusic.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import my.sunghyuk.lifemusic.domain.Record;

@Getter
@Builder
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

	public Record buildDomain() {
		Record record = Record.builder()
				.id(id)
				.name(name)
				.description(description)
				.imgURL(imgURL)
				.artist(artist)
				.releaseDate(releaseDate)
				.writer(writer)
				.createdDateTime(createdDateTime)
				.likeCount(likeCount) 
				.views(views)         
		        .rate(rate)           
		        .build();
						
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
