package com.rode.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "springConfig/spring-dubbo-provider.xml" });
		context.start();
		// press any key to exit
		System.in.read();
	}
}
