package my.sunghyuk.lifemusic.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.entity.mapper.CategoryMapper;
import my.sunghyuk.lifemusic.service.CommonService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
	
	@Autowired
	private CommonService commonService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<Genre> list(String keywords) {
		return commonService.getGenres(keywords);
	}
	
}
