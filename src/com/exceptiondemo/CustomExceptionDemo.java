package com.exceptiondemo;

public class CustomExceptionDemo {
public static void main(String[] args) throws IBException {
	BankAccount ba=new BankAccount();
	ba.deposit(500);
	System.out.println(ba.balance);
	try {ba.withdraw(2000);}
	catch(IBException e) {
		System.out.println("insufficent balance");
	}
	
	System.out.println(ba.balance);
}
}
