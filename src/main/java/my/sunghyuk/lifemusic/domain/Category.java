package my.sunghyuk.lifemusic.domain;

import lombok.Builder;
import lombok.Getter;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;

@Getter
@Builder
public class Category {
	private long id;
	private Category parent;
	private CategoryType categoryType;
    private String name;
    private String value;
    private int orderSequence;
	private String description;
}
