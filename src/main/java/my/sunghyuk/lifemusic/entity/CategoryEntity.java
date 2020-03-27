package my.sunghyuk.lifemusic.entity;

import my.sunghyuk.lifemusic.domain.Category;

public class CategoryEntity {
	private long id;
	private CategoryEntity parent;
	private CategoryType categoryType;
	private String name;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CategoryEntity getParent() {
		return parent;
	}

	public void setParent(CategoryEntity parent) {
		this.parent = parent;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Category buildDomain() {
		Category category = new Category();
		category.setId(id);
		category.setName(name);
		category.setCategoryType(categoryType);
		category.setDescription(description);
		
		if (parent != null)
			category.setParent(parent.buildDomain());
		
		return category;
	}
	
	public void buildEntity(Category category) {
		id = category.getId();
		name = category.getName();
		categoryType = category.getCategoryType();
		description = category.getDescription();
		if (category.getParent() != null) {
			parent = new CategoryEntity();
			parent.buildEntity(category.getParent());
		}
	}
	
}
