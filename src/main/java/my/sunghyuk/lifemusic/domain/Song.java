package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Song {

    private int id;
    private String name;
    private int no;
    private int record_id;

}
