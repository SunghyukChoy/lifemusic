package my.sunghyuk.lifemusic.converter;

import org.springframework.core.convert.converter.Converter;

import my.sunghyuk.lifemusic.entity.enums.CategoryType;

public class CategoryTypeEnumConverter implements Converter<String, CategoryType> {

    @Override
    public CategoryType convert(String source) {
        return CategoryType.valueOf(source.toUpperCase());
    }

}