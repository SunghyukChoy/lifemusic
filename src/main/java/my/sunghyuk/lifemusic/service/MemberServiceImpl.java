package my.sunghyuk.lifemusic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.sunghyuk.lifemusic.domain.LoginMember;
import my.sunghyuk.lifemusic.domain.Member;
import my.sunghyuk.lifemusic.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

	@Override
	public LoginMember login(String id, String password) {
		//return true;
	    return null;
	}

    @Override
    public String register(Member member) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public LoginMember findLoginMemberByMemberId(String memberId) {
        return memberRepository.getOneByUserId(memberId).buildLoginMember();
    }

    @Override
    public Member findByMemberId(String memberId) {
        return memberRepository.getOneByUserId(memberId).buildDomain();
    }

}
