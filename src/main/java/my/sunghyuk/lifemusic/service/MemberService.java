package my.sunghyuk.lifemusic.service;

import my.sunghyuk.lifemusic.domain.LoginUser;
import my.sunghyuk.lifemusic.domain.Member;

public interface MemberService {
    
	LoginUser login(String id, String password);   // TODO: "password" should be hash encryption (ex: sha-512, bCrypt...)
    String register(Member member);
    
}
