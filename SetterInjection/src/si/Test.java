package si;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Resource rs =new ClassPathResource("applicationContext.xml");
BeanFactory bean =new XmlBeanFactory(rs);
Employee emp= (Employee)bean.getBean("e1");
emp.display();

	}

}
