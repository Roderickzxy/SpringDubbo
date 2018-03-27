package com.rode.service.impl;

import com.rode.service.DemoService;

public class DemoServiceImpl implements DemoService {
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
