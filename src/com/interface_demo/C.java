package com.interface_demo;

public class C implements B,A{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("from class C which implements interface B");
	}

}
