package my.sunghyuk.lifemusic.entity.mapper;

import java.util.List;

import my.sunghyuk.lifemusic.domain.CategorySearch;
import my.sunghyuk.lifemusic.entity.CategoryEntity;

public interface CategoryMapper {
	
	CategoryEntity find(long id);
	List<CategoryEntity> findCategories(CategorySearch categorySearch);
	
}
