package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
    	// getting the context from the XML file essentially makes this one giant 
    	// implementation of the factory method, which is good for increasing the
    	// modularity of program design.
    	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
    	obj.getMessage();
    }
}
