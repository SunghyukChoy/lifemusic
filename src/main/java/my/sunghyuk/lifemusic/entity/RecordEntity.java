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
//    private String imgURL;
//    private String artist;
    private LocalDate releaseDate;
//    private String writer;
    private int likeCount;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public Record buildDomain() {
        Record record = new Record();
        record.setId(id);
        record.setName(name);
        record.setDescription(description);
//        record.setImgURL(imgURL);
//        record.setArtist(artist);
        record.setReleaseDate(releaseDate);
//        record.setWriter(writer);
        record.setCreatedDateTime(createdDateTime);
        record.setLikeCount(likeCount);
//        record.setViews(views);
//        record.setRate(rate);
        return record;
    }

    public void buildEntity(Record record) {
        this.id = record.getId();
        this.name = record.getName();
        this.description = record.getDescription();
//        this.imgURL = record.getImgURL();
//        this.artist = record.getArtist();
        this.releaseDate = record.getReleaseDate();
//        this.writer = record.getWriter();
        this.createdDateTime = record.getCreatedDateTime();
        this.likeCount = record.getLikeCount();
//        this.views = record.getViews();
//        this.rate = record.getRate();
    }
}
