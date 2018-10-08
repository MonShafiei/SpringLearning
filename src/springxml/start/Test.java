package springxml.start;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import springxml.entity.Member;

public class Test {

	public static void main(String[] args) {

		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Spring.xml"));
		Member m = (Member) factory.getBean("memberId");
		
		
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");
//		Member m = (Member) ctx.getBean("memberId");
		
		m.setFamily("Shafiei");
		m.setName("Mohsen");
		m.setId(12);
		System.out.println(m.toString());
		
	}

}
