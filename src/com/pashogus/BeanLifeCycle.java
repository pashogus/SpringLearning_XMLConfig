package com.pashogus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
		Coach  theCoach = context.getBean("myCoach", Coach.class);
		
		Coach  theCoachNew = context.getBean("myCoach", Coach.class);
		
		System.out.println("Memory Location of theCoach"+ theCoach);
		
		System.out.println("Memory Location of theCoachNew"+ theCoachNew);

		context.close();

	}

}


