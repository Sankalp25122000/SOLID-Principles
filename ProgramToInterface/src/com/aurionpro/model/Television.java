package com.aurionpro.model;

public class Television implements IDisplayable {
	@Override
	public void display(String message) {
		System.out.println("On Television : "+message);
	}
}
