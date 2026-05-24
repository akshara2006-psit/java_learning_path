package com.abstractDemo;

public class Starter {
public static void main(String[] args) {
	Figure f1=new Rectangle(4,5);
	System.out.println(f1.calculateArea());
	f1=new Triangle(60,90);
	System.out.println(f1.calculateArea());
	f1.prn();
}
}
 