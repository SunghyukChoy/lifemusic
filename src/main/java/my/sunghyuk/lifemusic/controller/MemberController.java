package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.model.LoginModel;
import my.sunghyuk.lifemusic.service.MemberService;

@Controller
public class MemberController {

    public static final String REGISTER_VIEW = "member/register";

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/member/login", method = RequestMethod.GET)
    public ModelAndView login(
            @RequestParam(value = "redirect-url", defaultValue = "", required = false) String redirectUrl) {
        ModelAndView mv = new ModelAndView("member/login");
        mv.addObject("loginModel", LoginModel.builder().redirectUrl(redirectUrl).build());
        return mv;
    }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView error() {
        ModelAndView mv = new ModelAndView("member/error");
        mv.addObject("errorMessage", "로그인이 실패하였습니다.");
        return mv;
    }

    @RequestMapping(value = "/member/register", method = RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView(REGISTER_VIEW);
        return mv;
    }

    @RequestMapping(value = "/myinfo", method = RequestMethod.GET)
    public ModelAndView myinfo() {
        ModelAndView mv = new ModelAndView("member/info");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        mv.addObject("member", memberService.findById((long) authentication.getPrincipal()));
        return mv;
    }

}
