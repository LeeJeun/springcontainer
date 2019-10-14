package config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.user.User;

@Configuration // auto scan을 하기 위한 설정
public class UserConfig02 {
	@Bean
	public User user() {
		return new User();
	}
}
