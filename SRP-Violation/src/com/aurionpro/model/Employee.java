package com.aurionpro.model;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + salary + "]";
	}
	
	public double calculateTax() {
		if(salary*12<500000) {
			return 0.0;
		}
		else {
			return salary*0.2;
		}
	}
	public void printSalary() {
		System.out.println("ID :"+id);
		System.out.println("Name :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("Tex :"+calculateTax());
	}

}
