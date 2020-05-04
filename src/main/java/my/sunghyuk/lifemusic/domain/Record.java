package my.sunghyuk.lifemusic.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import my.sunghyuk.lifemusic.entity.enums.RecordType;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Record {

    private long id;
    private String name;
    private String description;
    private String imgURL;
    private String artist;
    private LocalDate releaseDate;
    private RecordType recordType;
    private String writer;
    private int likeCount;
    private List<Genre> genres;
    private String genreNames;
    private Musician musician;
    private LocalDateTime createdDateTime;
    private int views;
    private double rate;

}