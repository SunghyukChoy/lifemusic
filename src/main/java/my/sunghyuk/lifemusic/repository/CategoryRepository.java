package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.domain.CategorySearch;
import my.sunghyuk.lifemusic.entity.CategoryEntity;

public interface CategoryRepository {

    CategoryEntity find(long id);

    List<CategoryEntity> findCategories(CategorySearch categorySearch);

}
