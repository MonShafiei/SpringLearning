package annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springxml.entity.Member;
import springxml.entity.MemberType;

@Configuration
public class Config {

	@Bean
	public Member getMember() {
		return new Member();
	}

	@Bean(name="memberType")
	public MemberType getMemberType() {
		return new MemberType();
	}

}
