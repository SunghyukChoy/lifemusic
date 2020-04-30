package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.model.LoginModel;
import my.sunghyuk.lifemusic.service.MemberService;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/login2", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "redirect-url", required = false) String redirectUrl) {
        ModelAndView mv = new ModelAndView("member/login");
        mv.addObject("loginModel", LoginModel.builder().redirectUrl(redirectUrl).build());
        return mv;
    }

    // @RequestMapping(value = "/login", method = RequestMethod.POST)
    // public ModelAndView tryLogin(@RequestParam LoginModel model, HttpSession
    // session) {
    // ModelAndView mv = new ModelAndView();
    // LoginMember member = memberService.login(model.id, model.password);

    // mv.setViewName(member == null ? "member/login" : "redirect:" +
    // (model.redirectUrl.isEmpty() ? "/" : model.redirectUrl));

    // return mv;
    // }

    // @RequestMapping(value = "/logout", method = RequestMethod.GET)
    // public ModelAndView logout() {
    // return new ModelAndView("member/logout");
    // }

    @RequestMapping(value = "/error", method = RequestMethod.GET)
    public ModelAndView error() {
        ModelAndView mv = new ModelAndView("member/error");
        mv.addObject("errorMessage", "로그인이 실패하였습니다.");
        return mv;
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "member/register";
    }

    @RequestMapping(value = "/member/{memberId}", method = RequestMethod.GET)
    public ModelAndView myinfo(@PathVariable String memberId) {
        ModelAndView mv = new ModelAndView("member/info");
        Member member = memberService.findByMemberId(memberId);

        mv.addObject("member", member);
        return mv;
    }

}
