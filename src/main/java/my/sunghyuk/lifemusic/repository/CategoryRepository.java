package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.CategoryType;

public interface CategoryRepository {

	List<CategoryEntity> getCategories(CategoryType categoryType, String keywords);
	
}
