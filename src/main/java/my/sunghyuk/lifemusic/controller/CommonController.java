package my.sunghyuk.lifemusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.service.CommonService;

@RestController
public class CommonController {
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(value = "/genres", method = RequestMethod.GET)
	public List<Genre> genres(String keywords) {
		return commonService.getGenres(keywords);
	}
	
	@RequestMapping(value = "/menus", method = RequestMethod.GET)
	public List<Menu> menus() {
		return commonService.getMenus();
	}
}
