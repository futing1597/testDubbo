package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.TestService;

public class Consumer {
	public static void main(String[] args) {

		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer2 start");
		TestService demoService = (TestService)context.getBean(TestService.class);
		System.out.println("consumer2");
		System.out.println(demoService.getPermissions(1L));
	}
}
