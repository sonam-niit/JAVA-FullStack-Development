package com.simplilearn.DemoSpring;

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
    	ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	Student s1=(Student)context.getBean("s");
    	Student s2=(Student)context.getBean("s");
    	
    	System.out.println(s1==s2);// created object is singleton
        System.out.println( "Name: "+ s1.getName() );
        Marks marks=s1.getMarks();
        
        System.out.println(marks.getChem()+" "+marks.getPhy()+" "+marks.getMath());
    }
}
