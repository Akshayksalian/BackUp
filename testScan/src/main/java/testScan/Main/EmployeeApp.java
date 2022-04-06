package testScan.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import testScan.config.AppConfig;
import testScan.service.EmployeeService;

public class EmployeeApp {

	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmployeeService employeeBean = (EmployeeService) context.getBean("employeeService");
		System.out.println(employeeBean.getEmployeeById(3));
		
		context.close();
	}

}
