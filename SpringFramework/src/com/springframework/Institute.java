package com.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Institute {
	public static void main(String[] args) {
		
		//create spring container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationcontext.xml");
		//get bean
		
		Students s=(Students) ctx.getBean("sravani");
		s.studentDetails();
		
		ConstructorTwo cs = (ConstructorTwo) ctx.getBean("constructorexample");
		cs.getConstructor().ConstructorOne();
	}

}
