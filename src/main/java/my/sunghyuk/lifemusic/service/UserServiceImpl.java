package my.sunghyuk.lifemusic.service;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Override
	public boolean login(String id, String password) {
		return true;
	}

	@Override
	public boolean register() {
		// TODO Auto-generated method stub
		return true;
	}

}
