package my.sunghyuk.lifemusic.controller;

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
	public String tryLogin(LoginModel model) {
	    
	    LoginUser member = memberService.login(model.id, model.password);
	    
	    // TODO: manage session
	    
        return "redirect:" + (model.redirectUrl.isEmpty() ? "/" : model.redirectUrl);
    }
	
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "member/register";
	}
	
}
