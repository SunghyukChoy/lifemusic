package my.sunghyuk.lifemusic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.entity.MusicianEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;
import my.sunghyuk.lifemusic.repository.MemberRepository;
import my.sunghyuk.lifemusic.repository.MusicianRepository;
import my.sunghyuk.lifemusic.service.CommonService;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private MusicianRepository musicianRepository;

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/member/{id}")
    public MemberEntity getMember(@PathVariable("id") long id) {
        return memberRepository.findById(id);
    }

    @RequestMapping(value = "/categories/{categoryType}")
    public List<CategoryEntity> getCategories(@PathVariable("categoryType") CategoryType categoryType,
            @RequestParam String keywords) {
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

    @RequestMapping(value = "/musician/{musicianId}")
    public MusicianEntity getMusician(@PathVariable long musicianId) {
        return musicianRepository.findById(musicianId);
    }
}