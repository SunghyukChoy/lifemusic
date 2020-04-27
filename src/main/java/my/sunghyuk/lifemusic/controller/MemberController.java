package my.sunghyuk.lifemusic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.domain.LoginUser;
import my.sunghyuk.lifemusic.model.LoginModel;
import my.sunghyuk.lifemusic.service.MemberService;

@Controller
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "redirect-url", required = false) String redirectUrl) {
	    ModelAndView mv = new ModelAndView("member/login");
	    
	    LoginModel model = new LoginModel();
	    model.setRedirectUrl(redirectUrl);
	    
	    mv.addObject("loginModel", model);
		return mv;
	}
	
    @RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView tryLogin(@RequestParam LoginModel model, HttpSession session) {
	    ModelAndView mv = new ModelAndView();
        LoginUser member = memberService.login(model.id, model.password);

        mv.setViewName(member == null ? "member/login" : "redirect:" + (model.redirectUrl.isEmpty() ? "/" : model.redirectUrl));

        return mv;
    }
    
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public ModelAndView logout() {
        return new ModelAndView("member/logout");
    }

    @RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
    public ModelAndView error() {
        ModelAndView mv = new ModelAndView("member/denied");
        mv.addObject("errorMessage", "로그인이 실패하였습니다.");
        return mv;
    }
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "member/register";
	}
	
}
