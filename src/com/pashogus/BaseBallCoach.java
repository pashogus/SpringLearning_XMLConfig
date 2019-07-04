/**
 * 
 */
package com.pashogus;

/**
 * @author 540091
 *
 */
public class BaseBallCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.pashogus.Coach#GetDailyWorkout()
	 */
	
	//Constructor argument should be private
	private FortuneService fortuneservice;
	
	//Creatign a constructor for dependencty injection, instead of creating a object fortune service inside this ,
	//we are injecting fortune object as dependent to constructor
	public BaseBallCoach(FortuneService thefortuneservice)
	{
		fortuneservice=thefortuneservice;
	}
	
	
	@Override
	public String GetDailyWorkout() {
		
		return "base ball is good";
	}

	@Override
	public String GetDailyFortune() {
		
		return fortuneservice.GetDailyFortune();
	}

}
