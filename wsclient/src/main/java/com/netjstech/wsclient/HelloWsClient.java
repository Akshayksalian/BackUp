package com.netjstech.wsclient;

public class HelloWsClient {

	public static void main(String[] args) {
		
		HelloImplService his = new HelloImplService();
		Hello hello = his.getHelloImplPort();
		System.out.println(hello.sayHello("Akshay"));

	}

}
