package com.SpringCore.SpringCore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/Collection/CSpringConfig.xml");
		Empolyee e1= (Empolyee) ctx.getBean("emp1");
		System.out.println(e1);
		

	}

}
