package com.springDemoApp.ref;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {

	@Override
	public void Process() {
		
		System.out.println("1st Best Cpu");

	}

}
