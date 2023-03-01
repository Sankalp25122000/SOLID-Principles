package com.aurionpro.model;

public class DiwaliInterest implements IFestivalInterest {

	@Override
	public double getInterestRate() {
		
		return 0.085;
	}

	@Override
	public String getFestivalName() {
		
		return "Diwali";
	}

}
