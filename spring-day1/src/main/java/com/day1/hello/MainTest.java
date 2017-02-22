package com.day1.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// 1.创建Spring 的 IOC 容器对象

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(context);
		//2.从IOC 容器中获取Bean实例
		HelloWorld hw=(HelloWorld) context.getBean("helloWorld");
		
		hw.sayHello();
	}

}
