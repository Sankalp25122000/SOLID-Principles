package com.aurionpro.model;

public class HoliInterest implements IFestivalInterest {

	@Override
	public double getInterestRate() {
		
		return 0.075;
	}

	@Override
	public String getFestivalName() {
		return "Holi";
	}

}
