package com.pashogus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHello {

	public static void main(String[] args) {

		/*
		1)create a Bean in spring config file - refer applicationcontext.xml
		2) load the spring config file(applicationcontext.xml)
		3) retrive bean
		4)call methods on bean
		5) close context
		
		** Spring context is known as Spring container
		*
		 * 
		 * */
		
		//2)load the spring config file(applicationcontext.xml) -- creating spring container
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycleInitDestroy.xml");
		
		//3) retrive bean
		TrackCoach theCoach= context.getBean("MyCoach", TrackCoach.class);
		
		//4)call methods on bean
		System.out.println(theCoach.GetDailyWorkout());
		System.out.println(theCoach.GetDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeamName());
		
		context.close();
		
	/*	
		output
		
		Run Daily
		Today is good day
		shansasi.28
		PASHOgus
		
		*/

		
		/*
		 * 
		 * Custom code during Bean Initialization----
Run Daily
Today is good day
null
null
Custom code during Bean Destroy----

		 */

	}

}
