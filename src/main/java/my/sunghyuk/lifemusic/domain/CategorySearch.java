package my.sunghyuk.lifemusic.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;

@Getter
@AllArgsConstructor
public class CategorySearch {
	private CategoryType categoryType;
	private String keywords;
}
