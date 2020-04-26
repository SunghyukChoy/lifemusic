package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.repository.MemberRepository;

@RestController
@RequestMapping(value = "/api")
public class ApiController {

    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping(value = "/member/{id}")
    public MemberEntity getMember(@PathVariable long id) {
        return memberRepository.findById(id);
    }

}