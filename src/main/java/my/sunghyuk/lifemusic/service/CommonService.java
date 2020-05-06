package my.sunghyuk.lifemusic.service;

import java.util.List;

import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;

public interface CommonService {

    List<Genre> getGenres(String keywords);

    List<Menu> getTopMenus();

    List<Menu> getAllMenus();

}
