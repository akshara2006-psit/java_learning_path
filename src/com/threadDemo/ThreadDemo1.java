package com.threadDemo;

public class ThreadDemo1 extends Thread{
	public void run() {
		System.out.println("from thread demo");
	}
public static void main(String[] args) {
	ThreadDemo1 td=new ThreadDemo1();
	td.run();
}
}
