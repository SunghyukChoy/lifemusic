package my.sunghyuk.lifemusic.repository;

import java.util.List;

import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;

public interface CategoryRepository {

    CategoryEntity find(long id);

    List<CategoryEntity> findCategories(CategoryType categoryType, String keywords);

}
