package my.sunghyuk.lifemusic.entity;

import lombok.Getter;
import my.sunghyuk.lifemusic.domain.Category;
import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;

@Getter
public class CategoryEntity {
	private long id;
	private CategoryType categoryType;
    private String name;
    private String value;
    private int orderSequence;
	private String description;
	private CategoryEntity parent;
	
	public Category buildDomain() {
        Category category = Category.builder()
            .id(id)
            .name(name)
            .categoryType(categoryType)
            .orderSequence(orderSequence)
            .description(description).build();
        
            // TODO: parent logic
		// if (parent != null)
		// 	category.setParent(parent.buildDomain());
		
		return category;
	}
	
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
	
	public Genre buildGenre() {
		Genre genre = Genre.builder()
            .id(id)
            .name(name)
            .value(value)
            .orderSequence(orderSequence)
            .build();
        
            // TODO
		// if (parent != null)
		// 	genre.setParent(parent.getParent().buildGenre());
		
		return genre;
	}
	
	public Menu buildMenu() {
		Menu menu = Menu.builder()
		    .id(id)
            .name(name)
            .url(value)
            .build();

		return menu;
	}
}
