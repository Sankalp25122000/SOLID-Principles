package com.aurionpro.test;

import com.aurionpro.model.Employee;
import com.aurionpro.model.SalaryPrinter;
import com.aurionpro.model.Tax;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee(101,"Sankalp",60000);
		//new Tax().calculateTax(emp);
		new SalaryPrinter().printSalary(emp);
		//System.out.println(new Tax().calculateTax(emp));

	}

}
