package my.sunghyuk.lifemusic.entity;

import java.time.LocalDateTime;

import lombok.Getter;
import my.sunghyuk.lifemusic.entity.enums.RecordType;

@Getter
public class RecordTrackEntity {
    private long id;
    private String name;
    private RecordType recordType;
    private RecordEntity record;
    private int trackNo;
    private SongEntity song;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
}