package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Musician {
    private long id;
    private String name;
    private int debutYear;
}
