package my.sunghyuk.lifemusic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import my.sunghyuk.lifemusic.domain.Artist;
import my.sunghyuk.lifemusic.domain.Genre;
import my.sunghyuk.lifemusic.domain.Menu;
import my.sunghyuk.lifemusic.entity.CategoryEntity;
import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.entity.enums.CategoryType;
import my.sunghyuk.lifemusic.repository.CategoryRepository;
import my.sunghyuk.lifemusic.repository.MemberRepository;
import my.sunghyuk.lifemusic.service.CommonService;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CommonService commonService;

    @RequestMapping(value = "/member/{id}", method = RequestMethod.GET)
    public MemberEntity getMember(@PathVariable long id) {
        return memberRepository.findById(id);
    }

    @RequestMapping(value = "/categories/{categoryType}", method = RequestMethod.GET)
    public List<CategoryEntity> getCategories(@PathVariable CategoryType categoryType, @RequestParam String keywords) {
        return categoryRepository.findCategories(categoryType, keywords);
    }

    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public List<Menu> getMenus() {
        return commonService.getTopMenus();
    }

    @RequestMapping(value = "/genres", method = RequestMethod.GET)
    public List<Genre> getGenres(@RequestParam(required = false) String keywords) {
        return commonService.getGenres(keywords);
    }

    @RequestMapping(value = "/artists", method = RequestMethod.GET)
    public List<Artist> getArtists() {
        List<Artist> artists = new ArrayList<>();

        // 현업에서는 Setter 에서 일어나는 많은 문제로 Setter 사용을 지양하고있고,
        // 이를 해소하기 위해 생성자를 통해 값을 넣거나 (이경우는 @AllArgsConstructor, @NoArgsConstructor,
        // @RequiredArgsConstructor 세가지 사용)
        // 혹은 Builder Pattern 을 통해서 (이경우는 @Builder 지정) 필요한 값만 설정해서 넣는다.
        // Artist artist = new Artist(1, "최성혁", null, null, "아무거나"); // 생성자 입력 방법
        Artist artist = Artist.builder() // 빌더 패턴
                .id(1).name("최성혁").description("아무거나").birth("2000.01.01").gender("female").build();

        artists.add(artist);

        return artists;
    }
}