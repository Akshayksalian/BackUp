package com.springDemoXML.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
//		Vehicle v = (Vehicle)context.getBean("car");
//		v.drive();
		
//		Tyre t = (Tyre)context.getBean("tyre");
//		System.out.println(t);
		
		Car c = (Car)context.getBean("car");
		c.drive();
		
		context.close();
	}

}
