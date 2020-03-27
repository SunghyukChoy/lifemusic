package my.sunghyuk.lifemusic.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.sunghyuk.lifemusic.domain.CategorySearch;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.CategoryType;
import my.sunghyuk.lifemusic.entity.mapper.CategoryMapper;

@Repository
public class CategoryRepositoryMyBatis implements CategoryRepository {

	@Autowired
	private CategoryMapper mapper;
	
	@Override
	public List<CategoryEntity> getCategories(CategoryType categoryType, String keywords) {
		keywords = keywords == null ? "" : keywords;
		return mapper.findCategories(new CategorySearch(categoryType, keywords));
	}

}
