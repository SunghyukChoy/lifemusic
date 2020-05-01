package my.sunghyuk.lifemusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import my.sunghyuk.lifemusic.converter.TestComponent;
import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.service.CommonService;

@RestController
public class CommonController {

    @Autowired
    private CommonService commonService;

    @Autowired
    private TestComponent a;

    @RequestMapping(value = "/genres", method = RequestMethod.GET)
    public @ResponseBody List<Genre> genres(String keywords) {
        return commonService.getGenres(keywords);
    }

    @RequestMapping(value = "/menus", method = RequestMethod.GET)
    public @ResponseBody List<Menu> menus() {
        return commonService.getTopMenus();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public int test() {
        return a.hashCode();
    }
}
