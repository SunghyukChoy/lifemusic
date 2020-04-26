package my.sunghyuk.lifemusic.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Getter;
import my.sunghyuk.lifemusic.entity.enums.MusicianType;

@Getter
public class MusicianEntity {
    private long id;
    private String name;
    private MusicianType musicianType;
    private LocalDate debutYear;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;
}
