package my.sunghyuk.lifemusic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.service.AlbumService;

@Controller
@RequestMapping(value = "/album")
public class AlbumController {

	@Autowired
	private AlbumService service;
	
	private static final Logger logger = LoggerFactory.getLogger(AlbumController.class); 
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("album/list");
		mv.addObject("albums", service.getAllAlbums());
		
		return mv;
	}

}
