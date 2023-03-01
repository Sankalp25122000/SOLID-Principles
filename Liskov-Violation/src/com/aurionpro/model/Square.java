package com.aurionpro.model;

public class Square extends Rectangle {

	public Square(int side) {
		super(side, side);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

}
