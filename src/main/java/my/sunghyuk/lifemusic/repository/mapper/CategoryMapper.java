package my.sunghyuk.lifemusic.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;

public interface CategoryMapper extends CategoryRepository {
    List<CategoryEntity> findCategories(@Param("categoryType") CategoryType categoryType, @Param("keywords") String keywords);
}
