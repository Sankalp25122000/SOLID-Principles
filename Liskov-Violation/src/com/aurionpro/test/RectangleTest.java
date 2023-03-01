package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10, 20);
		System.out.println(isRectangle(rect));
		Rectangle square = new Square(10);
		System.out.println(isRectangle(square));

	}

	public static  boolean isRectangle(Rectangle rect) {
		int beforeHeight = rect.getHeight();
		rect.setWidth(80);
		int afterHeight = rect.getHeight();
		if(beforeHeight == afterHeight) {
			return true;
		}
		return false;
	}

}
