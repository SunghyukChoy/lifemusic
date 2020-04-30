package my.sunghyuk.lifemusic.entity;

import java.util.List;
import java.util.stream.Collectors;

import lombok.Getter;
import my.sunghyuk.lifemusic.domain.Category;
import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.entity.enums.DataStatus;

@Getter
public class CategoryEntity {
    private long id;
    private CategoryType categoryType;
    private String name;
    private String value;
    private DataStatus dataStatus;
    private int orderSequence;
    private String description;
    private List<CategoryEntity> childCategories;

    public Category buildDomain() {
        return Category.builder().id(id).name(name).categoryType(categoryType).orderSequence(orderSequence)
                .description(description)
                .childCategories(childCategories.stream().map(ctg -> ctg.buildDomain()).collect(Collectors.toList()))
                .build();
    }

    public void buildEntity(Category category) {
        id = category.getId();
        name = category.getName();
        categoryType = category.getCategoryType();
        description = category.getDescription();
        value = category.getValue();
        orderSequence = category.getOrderSequence();
        childCategories = category.getChildCategories().stream().map(ctg -> {
            CategoryEntity entity = new CategoryEntity();
            entity.buildEntity(ctg);
            return entity;
        }).collect(Collectors.toList());
    }

    public Genre buildGenre() {
        return Genre.builder().id(id).name(name).value(value).orderSequence(orderSequence)
                .childGenre(childCategories != null
                        ? childCategories.stream().map(g -> g.buildGenre()).collect(Collectors.toList())
                        : null)
                .build();
    }

    public Menu buildMenu() {
        return Menu.builder().id(id).name(name).url(value)
                .childMenus(childCategories != null
                        ? childCategories.stream().map(g -> g.buildMenu()).collect(Collectors.toList())
                        : null)
                .build();
    }
}
