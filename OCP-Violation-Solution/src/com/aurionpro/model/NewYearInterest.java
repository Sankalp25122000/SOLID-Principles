package com.aurionpro.model;

public class NewYearInterest implements IFestivalInterest {

	@Override
	public double getInterestRate() {
		
		return 0.08;
	}

	@Override
	public String getFestivalName() {
		return "New Year";
	}

}
