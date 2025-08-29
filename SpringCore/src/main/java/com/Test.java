package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Context Loaded");
		
		// To get a Student object we will create the object
		// Student student = new Student();
		// System.out.println(student);
		
		Student student = container.getBean("stu2",Student.class);
		// arguments 1. it is the bean name and 2.We has to say the type or it will assign to the object type
		// Object student = container.getBean("stu");
		// we has to say the type to the Container that it is Student type
		System.out.println(student);
		Student student2 = container.getBean("stu",Student.class);
		System.out.println(student2);
	}
}

/*
 * 
 * 1.From the context we has to load the beans 
 * 
 * 2. The object should be created by the spring 
 * 	  I has to get the bean from the Container (ApplicationContext)
 * 	  How to get the bean- This container have a method called get Bean
 * 	
 * 3. Assign to the Student class 
 * 	  If we say the type it assigns to the Student class 
 *    or it will assign to the object type 
 *    
 *    It will give the Context Loaded
	  Exception in thread "main" java.lang.IllegalStateException: BeanFactory not initialized or already closed - call 'refresh' before accessing beans via the ApplicationContext
	  at org.springframework.context.support.AbstractRefreshableApplicationContext.getBeanFactory(AbstractRefreshableApplicationContext.java:169)
	  at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1278)
	  at com.Test.main(Test.java:17)
 * 4. We have not created the beans any where .. 
 *    I need a bean and i has to pass the configuration
 * 5. We get the error becuase we has to give the file name 
 * we has to give the file name 
 * to which file we have to create the bean and from which file we has to accept the file 
 * 6. In the spring container we always get only one object 
 */
