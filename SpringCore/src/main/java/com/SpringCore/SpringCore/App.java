package com.SpringCore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext ctx=new ClassPathXmlApplicationContext("SpringConfig.xml");
      Student st1=  (Student) ctx.getBean("student1");
      Student st2=  (Student) ctx.getBean("student2");
      Student st3=  (Student) ctx.getBean("student3");
      Student st4=  (Student) ctx.getBean("student4");
      Student st5=  (Student) ctx.getBean("student5");
      
      System.out.println(st1);
      System.out.println(st2);
      System.out.println(st3);
      System.out.println(st5);
    }
}
