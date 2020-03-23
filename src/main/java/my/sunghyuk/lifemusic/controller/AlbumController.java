package my.sunghyuk.lifemusic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.common.DummyHelper;

@Controller
@RequestMapping(value = "/album")
public class AlbumController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("album/list");
		mv.addObject("albums", DummyHelper.GetDummyAlbums());
		return mv;
	}

}
