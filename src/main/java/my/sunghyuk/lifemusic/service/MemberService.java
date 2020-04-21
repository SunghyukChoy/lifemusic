package my.sunghyuk.lifemusic.service;

import my.sunghyuk.lifemusic.domain.Member;

public interface MemberService {
	
	Member login(String id, String password);
	boolean register();
	
	
}
