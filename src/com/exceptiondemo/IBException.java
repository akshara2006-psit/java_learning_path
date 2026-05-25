package com.exceptiondemo;

public class IBException extends Exception{
public IBException(String s) {
	System.out.println();
}
public IBException() {
	System.out.println("Insufficient space");
}
}
