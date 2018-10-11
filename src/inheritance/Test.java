package inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/inheritance/Spring.xml");

		Parent p = (Parent) ctx.getBean("parentid");
		System.out.println(p.toString());
		Child c= (Child) ctx.getBean("childid");
		System.out.println(c.toString());
	}

}
