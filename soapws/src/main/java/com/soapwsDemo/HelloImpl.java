package com.soapwsDemo;

import javax.jws.WebService;

@WebService(endpointInterface = "com.soapwsDemo.Hello")
public class HelloImpl implements Hello {

	@Override
	public String sayHello(String name) {
		System.out.println("In WebService");
		return "Hello " + name;
	}

}
