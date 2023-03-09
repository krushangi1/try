package com.spring;

public class cricketCoach implements Coach {
	private FortuneService fortuneService;
	
	//create null constc
	public cricketCoach() {
		System.out.println("cricket :no arg constc");
	}
	
	//setter methed
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricket : setter method");
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "practice bowling";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
