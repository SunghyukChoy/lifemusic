package my.sunghyuk.lifemusic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Genre;
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
			genres.add(parseGenre(entity));
		}
		
		return genres;
	}
	
	private Genre parseGenre(CategoryEntity entity) {
		Genre genre = new Genre();
		genre.setId(entity.getId());
		genre.setName(entity.getName());
		if (entity.getParent() != null)
			genre.setParent(parseGenre(entity.getParent()));
		
		return genre;
	}

}
