package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
MainTest test = (MainTest) ctx.getBean("mainTest");
System.out.println("hello test");
	}

}
