package com.SpringCore.Ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/SpringCore/Ref/SpringConfigRef.xml");
		A a=(A)ctx.getBean("refA");
		System.out.println(a);
		System.out.println(a.getB().getName());

	}

}
