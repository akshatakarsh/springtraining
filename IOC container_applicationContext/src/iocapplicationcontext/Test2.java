package iocapplicationcontext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test2 {
	public static void main(String s[]) {
		Resource rs= new ClassPathResource("appliationContext.xml");
		BeanFactory bean=new XmlBeanFactory(rs);
		Student st=(Student)bean.getBean("studentbean");
		st.displayInfo();
	}
}
