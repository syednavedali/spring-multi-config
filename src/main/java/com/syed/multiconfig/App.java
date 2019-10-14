package com.syed.multiconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.syed.multiconfig.bean.Teacher;

/**
 * Spring Multiple Config File example
 * syednavedali.com
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
                "spring-config.xml");
    	
    	Teacher teacher = context.getBean("teacher", Teacher.class);
    	System.out.println(teacher);
    }
}