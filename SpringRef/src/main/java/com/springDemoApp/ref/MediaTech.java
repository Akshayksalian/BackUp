package com.springDemoApp.ref;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTech implements MobileProcessor {

	@Override
	public void Process() {
		System.out.println("2nd Best Processor");
	}

}
