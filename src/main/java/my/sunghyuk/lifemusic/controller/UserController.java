package my.sunghyuk.lifemusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.sunghyuk.lifemusic.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String tryLogin() {
		boolean result = service.login("hyunmui", "1234");
		if (result) {
			return "user/login";
		} else {
			// TODO: Login 실패시 잘못된 메시지가 출력되도록 로직 추가
			return "";
		}
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register() {
		return "user/register";
	}
	
}
