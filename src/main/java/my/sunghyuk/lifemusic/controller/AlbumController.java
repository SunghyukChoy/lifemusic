package my.sunghyuk.lifemusic.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.common.exception.ResourceNotFoundException;
import my.sunghyuk.lifemusic.domain.Album;
import my.sunghyuk.lifemusic.service.AlbumService;

@Controller
@RequestMapping(value = "/album")
public class AlbumController {

	@Autowired
	private AlbumService service;

	private static final Logger logger = LoggerFactory.getLogger(AlbumController.class);

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list(@RequestParam(value = "search-filter", required = false) String searchFilter,
			@RequestParam(required = false) String keywords) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("album/list");
		 mv.addObject("albums", service.getAllAlbums());

		return mv;
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public ModelAndView detail(@RequestParam(value = "id") long id) {
		Album album = service.getAlbumById(id);

		if (album == null)
			throw new ResourceNotFoundException();

		ModelAndView mv = new ModelAndView();
		mv.setViewName("album/detail");
		mv.addObject("album", album);

		return mv;
	}

}
