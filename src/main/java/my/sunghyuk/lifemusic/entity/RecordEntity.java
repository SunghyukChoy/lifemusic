package my.sunghyuk.lifemusic.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import my.sunghyuk.lifemusic.domain.Record;
import my.sunghyuk.lifemusic.entity.enums.RecordType;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordEntity {

    private long id;
    private String title;
    private String description;
    private LocalDate releaseDate;
    private RecordType recordType;
    private int likeCount;
//    private RecordCoverEntity cover;
//    private List<RecordTrackEntity> tracks;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    private MusicianEntity musician;

    public Record buildDomain() {
        return Record.builder().id(id).name(title).description(description).recordType(recordType)
                .releaseDate(releaseDate).createdDateTime(createdDateTime).likeCount(likeCount)
                .musician(musician.buildDomain()).build();
    }

    public void buildEntity(Record record) {
        this.id = record.getId();
        this.title = record.getName();
        this.description = record.getDescription();
        this.releaseDate = record.getReleaseDate();
        this.recordType = record.getRecordType();
        this.createdDateTime = record.getCreatedDateTime();
        this.likeCount = record.getLikeCount();
        MusicianEntity musicianEntity = MusicianEntity.builder().build();
        musicianEntity.buildEntity(record.getMusician());
        this.musician = musicianEntity;
    }
}
