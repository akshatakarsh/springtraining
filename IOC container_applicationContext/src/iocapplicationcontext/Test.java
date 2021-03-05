package iocapplicationcontext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String s[]) {
	ApplicationContext bean =   
		    new ClassPathXmlApplicationContext("applicationContext.xml");  
	Student st=(Student)bean.getBean("studentbean");
	st.displayInfo();
}
}
