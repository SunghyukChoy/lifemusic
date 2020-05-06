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

    private List<Menu> allMenus;

    private List<Menu> topMenus;

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
    public List<Menu> getAllMenus() {
        if (allMenus == null) {
            List<CategoryEntity> entities = categoryRepository.findCategories(CategoryType.MENU, "");
            this.allMenus = entities.stream().map(ent -> ent.buildMenu()).collect(Collectors.toList());

            this.allMenus.stream().forEach(menu -> {
                menu.setChilds(entities.stream()
                        .filter(ent -> ent.getParent() != null && ent.getParent().getId() == menu.getId())
                        .map(ent -> ent.buildMenu()).collect(Collectors.toList()));
            });
        }
        return allMenus;
    }

    @Override
    public List<Menu> getTopMenus() {
        if (topMenus == null) {
            topMenus = getAllMenus().stream().filter(m -> m.getParent() == null).collect(Collectors.toList());
        }

        return topMenus;
    }

}