package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.service.CommonService;

@Controller
public class HomeController extends BaseController {

    @Autowired
    public HomeController(CommonService commonService) {
        super(commonService);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView home() {
        return createBasicModelAndView("index");
    }

}
