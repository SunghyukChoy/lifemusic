package my.sunghyuk.lifemusic.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import my.sunghyuk.lifemusic.converter.TestComponent;
import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;
import my.sunghyuk.lifemusic.repository.MemberRepository;
import my.sunghyuk.lifemusic.service.CommonService;
import my.sunghyuk.lifemusic.service.LoginService;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CommonService commonService;

    @Autowired
    private LoginService loginService;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private TestComponent testComponent;

    @RequestMapping(value = "/member/{id}")
    public MemberEntity getMember(@PathVariable long id) {
        return memberRepository.findById(id);
    }

    @RequestMapping(value = "/categories/{categoryType}")
    public List<CategoryEntity> getCategories(@PathVariable CategoryType categoryType, @RequestParam String keywords) {
        return categoryRepository.findCategories(categoryType, keywords);
    }

    @RequestMapping(value = "/menu")
    public List<Menu> getMenus() {
        return commonService.getTopMenus();
    }

    @RequestMapping(value = "/genres")
    public List<Genre> getGenres(@RequestParam(required = false) String keywords) {
        return commonService.getGenres(keywords);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Member tryLogin(HttpSession session, @RequestParam String memberId, @RequestParam String password)
            throws Exception {
        return loginService.login(session, memberId, password);
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public Member getMemberInfo(HttpSession session) throws Exception {
        String memberJson = session.getAttribute("member").toString();

        if (memberJson == null) {
            throw new Exception("로그인이 되어있지 않습니다");
        }

        return objectMapper.readValue(memberJson, Member.class);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public int test() {
        return testComponent.hashCode();
    }

    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    public int test2() {
        return new TestComponent().hashCode();
    }
}