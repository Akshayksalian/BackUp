package com.springDemoApp.ref;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/*
 * Spring core Annotations
 */

public class App {
	
public static void main(String[] args) {
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Samsung s = context.getBean(Samsung.class);
		s.config();
		
		context.close();
	}

}
