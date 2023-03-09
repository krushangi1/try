package com.spring;

public class baseballCoach implements Coach {
	// define a private field for the dependency
		private FortuneService fortuneService;
		
		public baseballCoach() {}
		
		// define a constructor for dependency injection
		public baseballCoach(FortuneService theFortuneService) {
			this.fortuneService = theFortuneService;
		}
		
		@Override
		public String getDailyWorkout() {
			return "Spend 30 minutes on batting practice";
		}

		@Override
		public String getDailyFortune() {		
			// use my fortuneService to get a fortune		
			return fortuneService.getFortune();
		}
}
