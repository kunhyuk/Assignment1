package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext  context = new ClassPathxmlApplicationContext();
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Student st1 = (Student) context.getBean("Student");

        System.out.println(st1);
        context.close();

    }
}
