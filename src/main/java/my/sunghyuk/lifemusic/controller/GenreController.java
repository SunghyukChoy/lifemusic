package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.service.CommonService;

@Controller
@RequestMapping(value = "/genre")
public class GenreController extends BaseController {

    @Autowired
    public GenreController(CommonService commonService) {
        super(commonService);
    }

    @RequestMapping(value = "/{genreName}", method = RequestMethod.GET)
    public ModelAndView genres(String genreName) {
        return createBasicModelAndView("record/list");
    }

}
