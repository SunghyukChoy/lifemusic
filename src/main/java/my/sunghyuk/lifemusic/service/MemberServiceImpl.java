package my.sunghyuk.lifemusic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.LoginMember;
import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.entity.MemberEntity;
import my.sunghyuk.lifemusic.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public String register(Member member) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LoginMember findLoginMemberByMemberId(String memberId) {
        MemberEntity entity = memberRepository.getOneByUserId(memberId);
        return entity != null ? entity.buildLoginMember() : null;
    }

    @Override
    public Member findByMemberId(String memberId) {
        MemberEntity entity = memberRepository.getOneByUserId(memberId);
        return entity != null ? entity.buildDomain() : null;
    }

    @Override
    public Member findById(long id) {
        MemberEntity entity = memberRepository.findById(id);
        return entity != null ? entity.buildDomain() : null;
    }

}
