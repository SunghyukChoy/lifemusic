package my.sunghyuk.lifemusic.domain;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;

@Getter
@Builder
public class Category {
    private long id;
    private List<Category> childCategories;
    private CategoryType categoryType;
    private String name;
    private String value;
    private int orderSequence;
    private String description;
}
