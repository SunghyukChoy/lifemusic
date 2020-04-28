package my.sunghyuk.lifemusic.service;

import my.sunghyuk.lifemusic.domain.LoginMember;
import my.sunghyuk.lifemusic.domain.Member;

public interface MemberService {
    
    LoginMember login(String id, String password);   // TODO: "password" should be hash encryption (ex: sha-512, bCrypt...)
    LoginMember findLoginMemberByMemberId(String memberId);
    String register(Member member);
	Member findByMemberId(String memberId);
    
}
