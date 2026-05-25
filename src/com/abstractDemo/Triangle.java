package com.abstractDemo;

public class Triangle extends Figure{

	Triangle(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateArea() {
		System.out.println("area of triangle");
		return val1*val2/2;
	}


}
