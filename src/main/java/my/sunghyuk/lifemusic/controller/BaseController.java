package my.sunghyuk.lifemusic.controller;

import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.service.CommonService;

public abstract class BaseController {

    protected final CommonService commonService;
    
    public BaseController(CommonService commonService) {
        this.commonService = commonService;
    }
    
    public ModelAndView createBasicModelAndView(String viewPath) {
        ModelAndView mv = new ModelAndView(viewPath);
        mv.addObject("menus", commonService.getTopMenus());
        return mv;
    }
    
}
