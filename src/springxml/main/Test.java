package springxml.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import annotation.Config;
import springxml.entity.Member;
import springxml.entity.MemberType;

public class Test {

	public static void main(String[] args) {

		
		
		
//		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring.xml"));
//		Member m = (Member) factory.getBean("memberId");
//		
		
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		Member m = ctx.getBean(Member.class);
		//MemberType mt = ctx.getBean(MemberType.class);
		//MemberType mt = (MemberType) ctx.getBean("memberType");
		
		//mt.setDetails("Hichi");
		
		
		m.getMemberType().setDetails("Hichiiiii");
		//m.setMemberType(mt);
		m.setFamily("Shafiei");
		m.setName("Mohsen");
		m.setId(12);
		System.out.println(m.toString());
		
	}

}
