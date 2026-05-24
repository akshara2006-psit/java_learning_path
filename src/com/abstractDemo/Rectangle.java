package com.abstractDemo;

public class Rectangle extends Figure{

	Rectangle(int a, int b) {
		super(a, b);
		
	}

	@Override
	double calculateArea() {
		
		System.out.println("area of rectnagle");
		return val1*val2;
	}
	

}
