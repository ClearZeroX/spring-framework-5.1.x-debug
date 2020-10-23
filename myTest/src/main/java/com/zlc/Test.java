package com.zlc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : 清零
 * @create : 2020-09-20 12:13
 * @desc :
 **/
public class Test {
	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		TestService bean = context.getBean(TestService.class);

		ApplicationContext ac = new MyClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
		Person person = ac.getBean(Person.class);
		System.out.println(person);
	}
}
