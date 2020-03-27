package my.sunghyuk.lifemusic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;

@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public List<Genre> getGenres(String keywords) {
		List<CategoryEntity> entities = categoryRepository.getCategories(CategoryType.GENRE, keywords);
		List<Genre> genres = new ArrayList<>();
		for (CategoryEntity entity : entities) {
			genres.add(entity.buildGenre());
		}
		
		return genres;
	}

	@Override
	public List<Menu> getMenus() {
		List<CategoryEntity> entities = categoryRepository.getCategories(CategoryType.MENU, null);
		ArrayList<Menu> menus = new ArrayList<>();
		
		for (CategoryEntity entity : entities) {
			menus.add(entity.buildMenu());
		}
		
		return menus;
	}

}
