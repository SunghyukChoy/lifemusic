package my.sunghyuk.lifemusic.domain;

import my.sunghyuk.lifemusic.entity.CategoryType;

public class CategorySearch {
	private CategoryType categoryType;
	private String keywords;
	
	public CategorySearch(CategoryType categoryType, String keywords) {
		super();
		this.categoryType = categoryType;
		this.keywords = keywords;
	}
	
	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keyword) {
		this.keywords = keyword;
	}

}
