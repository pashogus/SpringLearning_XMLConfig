package com.pashogus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated /*
	/*	1)create a Bean in spring config file - refer applicationcontext.xml
		2) load the spring config file(applicationcontext.xml)
		3) retrive bean
		4)call methods on bean
		5) close context
		
		** Spring context is known as Spring container
		*
		 * 
		 * */
		
		//2)load the spring config file(applicationcontext.xml) -- creating spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//3) retrive bean
		Coach theCoach= context.getBean("myCoach",Coach.class);
		
		//4)call methods on bean
		System.out.println(theCoach.GetDailyWorkout());
		System.out.println(theCoach.GetDailyFortune());
		
		
		context.close();
	}

}
