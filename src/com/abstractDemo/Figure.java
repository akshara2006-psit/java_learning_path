package com.abstractDemo;

abstract public class Figure {
int val1;
int val2;
Figure(int a,int b){
	val1=a;
	val2=b;
}
abstract double calculateArea();
final void prn() {
	System.out.println("from prn method-figure");
}
}
