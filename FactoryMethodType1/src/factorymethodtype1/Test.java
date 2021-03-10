package factorymethodtype1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext cons=new ClassPathXmlApplicationContext("beans.xml");
A a=(A)cons.getBean("a");
a.msg();
		
		
	}

}
