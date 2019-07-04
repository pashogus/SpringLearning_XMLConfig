/**
 * 
 */
package com.pashogus;

/**
 * @author 540091
 *
 */
public class TrackCoach implements Coach {

	/* (non-Javadoc)
	 * @see com.pashogus.Coach#GetDailyWorkout()
	 */
	
	private FortuneService fortuneService;
	private String email;
	private String teamName;
	
/*	public FortuneService getFortuneService() {
		return fortuneService;
	} */

	public String getEmail() {
		return email;
	}

	
	public String getTeamName() {
		return teamName;
	}


	
	//Setter dependeny injection for literal parameters
	public void setEmail(String email) {
		this.email = email;
	}

	//Setter dependeny injection for literal parameters
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


	//Setter dependency Injection by Ref 
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

/*	public TrackCoach()
	{
		System.out.println("Check");
	}
	*/

	
	@Override
	public String GetDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run Daily";
	}

	@Override
	public String GetDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.GetDailyFortune();
	}
	
	public String InitializationMethod()
	{
		System.out.println("Custom code during Bean Initialization----");
		return "Custom code during Bean Initialization";
		
	}
	
	public String DestroyMethod()
	{
		System.out.println("Custom code during Bean Destroy----");
		return "Custom code during Bean Destroy";
		
	}

}
