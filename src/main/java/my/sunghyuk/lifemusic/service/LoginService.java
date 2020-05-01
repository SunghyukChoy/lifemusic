package my.sunghyuk.lifemusic.service;

import javax.servlet.http.HttpSession;

import my.sunghyuk.lifemusic.domain.Member;

public interface LoginService {

    Member login(HttpSession session, String memberId, String password) throws Exception;

}
