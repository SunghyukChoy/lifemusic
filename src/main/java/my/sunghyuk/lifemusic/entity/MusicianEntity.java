package my.sunghyuk.lifemusic.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import my.sunghyuk.lifemusic.domain.Musician;
import my.sunghyuk.lifemusic.entity.enums.MusicianType;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MusicianEntity {
    private long id;
    private String name;
    private MusicianType musicianType;
    private int debutYear;
    private long createdBy;
    private LocalDateTime createdDateTime;
    private LocalDateTime updatedDateTime;

    public Musician buildDomain() {
        return Musician.builder().id(id).name(name).debutYear(debutYear).build();
    }

    public void buildEntity(Musician musician) {
        this.id = musician.getId();
        this.name = musician.getName();
        this.debutYear = musician.getDebutYear();
    }
}
