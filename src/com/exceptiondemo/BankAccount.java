package com.exceptiondemo;

public class BankAccount {
double balance=500;
void deposit(double amt) {
	balance=balance+amt;
}
void withdraw(double amt) throws IBException {
	if(balance-amt<500) {
		throw new IBException();
	}
	else {
		balance=balance-amt;
	}
	
}
}
