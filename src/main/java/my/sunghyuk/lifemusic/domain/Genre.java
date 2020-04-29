package my.sunghyuk.lifemusic.domain;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Genre {
    private long id;
    private List<Genre> childGenre;
    private String name;
    private String value;
    private int orderSequence;
}
