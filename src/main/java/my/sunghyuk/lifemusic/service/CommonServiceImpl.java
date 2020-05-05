package my.sunghyuk.lifemusic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;

@Service
public class CommonServiceImpl implements CommonService {

    private final CategoryRepository categoryRepository;

    private List<Menu> menus;

    @Autowired
    public CommonServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Genre> getGenres(String keywords) {
        List<CategoryEntity> entities = categoryRepository.findCategories(CategoryType.GENRE, keywords);
        List<Genre> genres = new ArrayList<>();

        for (CategoryEntity entity : entities) {
            genres.add(entity.buildGenre());
        }

        return genres;
    }

    @Override
    public List<Menu> getTopMenus() {
        if (menus == null) {
            this.menus = categoryRepository.findTopMenus().stream().map(ent -> ent.buildMenu())
                    .collect(Collectors.toList());
        }

        return menus;
    }

}