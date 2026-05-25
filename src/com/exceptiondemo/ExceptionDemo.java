package com.exceptiondemo;

public class ExceptionDemo {
public static void main(String[] args) {
		ExceptionDemo d1=new ExceptionDemo();
		d1.div();
}
void div() {
	int n=30,d=0;
	double val=0;
	try {
		val=n/d;
	}
	catch(ArithmeticException e) {
		System.out.println("from catch block"+e);
		throw e;
	}
	catch(Exception e) {
	System.out.println("from General catch ");}
	finally {
		System.out.println("from finally-always executed.");
	}
	System.out.println(val);
}
}
