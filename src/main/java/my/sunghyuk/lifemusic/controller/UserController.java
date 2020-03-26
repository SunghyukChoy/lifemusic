package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import my.sunghyuk.lifemusic.service.UserService;
import my.sunghyuk.lifemusic.service.UserServiceImpl;

public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/login")
	public String tryLogin() {
		boolean result = service.login("hyunmui", "1234");
		if (result) {
			return "user/login";
		} else {
			// TODO: Login 실패시 잘못된 메시지가 출력되도록 로직 추가
			return "";
		}
	}
	
}
