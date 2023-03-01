package com.aurionpro.model;

public class Tax {
	public double calculateTax(Employee emp) {
		if (emp.getSalary() * 12 < 500000) {
			return 0.0;
		} else {
			return emp.getSalary() * 0.2;
		}
	}

}
