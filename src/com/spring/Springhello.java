package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Springhello {

	public static void main(String[] args) {
	
		//Load configuration file 
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retreive bean from container
		Coach theCoach =context.getBean("myCoach",Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		
		// let's call our new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close content
		context.close();
	}

}
