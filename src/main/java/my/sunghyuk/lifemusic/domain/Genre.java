package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Genre {
	private long id;
	private Genre parent;
    private String name;
    private String value;
    private int orderSequence;
}
