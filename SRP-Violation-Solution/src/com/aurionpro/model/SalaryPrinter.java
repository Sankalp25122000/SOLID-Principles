package com.aurionpro.model;


public class SalaryPrinter {
	public void printSalary(Employee emp) {
		System.out.println("ID :"+emp.getId());
		System.out.println("Name :"+emp.getName());
		System.out.println("Salary :"+emp.getSalary());
		System.out.println("Tax :"+ new Tax().calculateTax(emp));
	}
}
