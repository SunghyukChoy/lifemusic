package my.sunghyuk.lifemusic.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.common.Constants;
import my.sunghyuk.lifemusic.domain.Breadcrumb;
import my.sunghyuk.lifemusic.domain.BreadcrumbItem;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.service.CommonService;

public abstract class BaseController {

    protected final CommonService commonService;

    public BaseController(CommonService commonService) {
        this.commonService = commonService;
    }

    public ModelAndView createBasicModelAndView(String viewPath) {

        ModelAndView mv = new ModelAndView(viewPath);

        mv.addObject(Constants.MODEL_KEY_MENU, commonService.getTopMenus());
        mv.addObject(Constants.MODEL_KEY_BREADCRUMB, getBreadcrumb(commonService.getAllMenus()));

        return mv;
    }

    private Breadcrumb getBreadcrumb(List<Menu> allMenus) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();

        String path = request.getRequestURI();
        Menu menu = allMenus.stream().filter(m -> m.getUrl().contains(path)).findFirst()
                .orElse(Menu.builder().name("HOME").build());

        List<BreadcrumbItem> items = new ArrayList<>();

        addBreadcrumbItem(items, menu);

        // danger: recursive
        return Breadcrumb.builder().title(menu.getName()).items(items).build();
    }

    private void addBreadcrumbItem(List<BreadcrumbItem> items, Menu menu) {
        Menu parent = menu.getParent();

        if (parent != null) {
            addBreadcrumbItem(items, parent);
        }

        items.add(BreadcrumbItem.builder().name(menu.getName()).url(menu.getUrl()).build());
    }

}
