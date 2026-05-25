package com.threadDemo;

public class ThreadDemo2 implements Runnable{

	@Override
	public void run() {
	System.out.println("from Run method");
		
	}
	public static void main(String[] args) {
		ThreadDemo2 td2=new ThreadDemo2();
		Thread t1=new Thread(td2);
		
		t1.run();
		System.out.println(t1);
	}

}
