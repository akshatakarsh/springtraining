package factorymethodtype3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext cons =new ClassPathXmlApplicationContext("beans.xml");
Printable p=(Printable) cons.getBean("p");
p.print();
	}

}
