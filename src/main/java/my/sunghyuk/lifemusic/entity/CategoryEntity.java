package my.sunghyuk.lifemusic.entity;

import java.util.List;

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
    private CategoryEntity parent;
    private List<CategoryEntity> childCategories;

    public void buildEntity(Category category) {
        id = category.getId();
        name = category.getName();
        categoryType = category.getCategoryType();
        description = category.getDescription();
        value = category.getValue();
        orderSequence = category.getOrderSequence();
        if (category.getParent() != null) {
            parent = new CategoryEntity();
            parent.buildEntity(category.getParent());
        }
    }

    public Category buildDomain() {
        return Category.builder().id(id).name(name).categoryType(categoryType).orderSequence(orderSequence)
                .description(description).build();
    }

    public Genre buildGenre() {
        return Genre.builder().id(id).name(name).value(value).orderSequence(orderSequence).build();
    }

    public Menu buildMenu() {
        return Menu.builder().id(id).name(name).url(value).parent(parent != null ? parent.buildMenu() : null).build();
    }
}
