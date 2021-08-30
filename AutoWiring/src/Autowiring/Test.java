package Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import byconstructor.Teacher;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ApplicationContext con= new ClassPathXmlApplicationContext("applicationContext.xml");
 A a=(A)con.getBean("a", A.class);
		a.display();
		Teacher teacher=(Teacher)con.getBean("teacher",Teacher.class);
		teacher.print();
	}

}
