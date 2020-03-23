package my.sunghyuk.lifemusic.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.sunghyuk.lifemusic.common.DummyHelper;
import my.sunghyuk.lifemusic.entity.Album;

@Controller
@RequestMapping(value = "/album")
public class AlbumController {

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		
		model.addAttribute("albums", DummyHelper.GetDummyAlbums());
		return "album/list";
	}

}
