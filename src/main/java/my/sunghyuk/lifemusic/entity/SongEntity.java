package my.sunghyuk.lifemusic.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

import lombok.Getter;

@Getter
public class SongEntity {
    private long id;
    private String name;
    private LocalTime runningTime;
    private MusicianEntity composer;
    private MusicianEntity lyricist;
    private MusicianEntity musician;
    private long createdBy;
    private LocalDateTime createdDateTime; 
    private LocalDateTime updatedDateTime;
}
