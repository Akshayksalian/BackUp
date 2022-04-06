package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import configs.appConfig;
import payments.PayService;
import scope.Message;

public class usingAppConfig {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
		
		// Using app Config Constructor
		PayService bean = context.getBean("BeanPay", PayService.class);
		bean.performPayment();
		
		//Using Getter and Setter
		
		
		
		/*
		 * in prototype demo it creates new instances for all the bean called.
		 * in singleton it will have the same instance.
		 */
		
		//ProtoType Demo
		Message mb = context.getBean("messageBean",Message.class);
		mb.setId(1);
		mb.setMessage("Hello");
		System.out.println(mb);
		
		Message mb1 = context.getBean("messageBean",Message.class);
		System.out.println(mb1);
		context.close();
	}

}
