package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

	public static void main(String[] args) {
		
		
//		Resource r = new ClassPathResource("applicationContext.xml");
//		BeanFactory factory=new XmlBeanFactory(r);
//		Employee e=(Employee)factory.getBean("emp");
//		e.display();
		
ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Employee e=(Employee)context.getBean("emp");
		e.display();
	}

}
