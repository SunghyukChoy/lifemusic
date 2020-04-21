package my.sunghyuk.lifemusic.dummy.service;

import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.dummy.DummyBuilder;
import my.sunghyuk.lifemusic.service.MemberService;

@Service("memberService")
public class DummyMemberService implements MemberService {

    @Override
    public Member login(String id, String password) {
        return DummyBuilder.getMember();
    }

    @Override
    public boolean register() {
        // TODO Auto-generated method stub
        return false;
    }

}
