package com.aurionpro.model;

public class TaxCalculator {
	private DBLogger dblogger;

	public TaxCalculator(DBLogger dblogge) {
		super();
		this.dblogger = dblogger;
	}

	public int calculateTax(int amount, int rate) {
		int tax = 0;
		try {
			tax = amount / rate;
			System.out.println("Your total tax is " + tax);
		} catch (Exception e) {
			new DBLogger().log("Divided by Zero ");
		}
		return tax;
	}

}
