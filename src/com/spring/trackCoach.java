package com.spring;

public class trackCoach implements Coach {
	private FortuneService fortuneService;
	public trackCoach() {
			
		}
		
		public trackCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}

	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run hard";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It: " + fortuneService.getFortune();
	}

}
