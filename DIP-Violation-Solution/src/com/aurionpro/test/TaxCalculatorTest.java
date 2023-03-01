package com.aurionpro.test;

import com.aurionpro.model.DBLogger;
import com.aurionpro.model.FileLogger;
import com.aurionpro.model.TaxCalculator;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		TaxCalculator t1 = new TaxCalculator(new DBLogger());
		t1.calculateTax(10000, 10);
		
		TaxCalculator t2 = new TaxCalculator(new FileLogger());
		t2.calculateTax(10000, 0);

		TaxCalculator t3 = new TaxCalculator(new FileLogger());
		t3.calculateTax(1000, 0);

	}

}
