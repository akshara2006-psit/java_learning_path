package com.StringDemo;

public class StringDemo {
public static void main(String[] args) {
	char a[]= {'a','b','c'};
	byte b[]= {97,98,99};
	String s1="Hello";
	String s2=new String("Hello");
	String s3=new String(a);
	String s4=new String(b);
	String s5="Hello";
	String s6=new String("hello");
	System.out.println(s3+" "+s4);
	System.out.println(s1.hashCode());
	s1="Tom";
	String s7=s1;
	System.out.println(s1==s7);
	System.out.println(s1.equals(s7));
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));
	s1="Hello India";
	s7="Bye";
	System.out.println(s1);
	String s8=s5+"Bye";
	System.out.println(s8);
	System.out.println("Hello"+1+2+3);
	System.out.println(1+2+3+"Hello");
	System.out.println(1+2+"Hello"+3);
	System.out.println(1+"Hello"+2+3);
	System.out.println(+1+2+3+"Hello");

	StringBuffer sb1=new StringBuffer("Hello");
	StringBuffer sb2=new StringBuffer("Bye");
	StringBuffer sb3=sb1.append(" India"); //String Buffer is mutable so s1 changes on append
	System.out.println(sb1==sb3);
	System.out.println(s1+"  "+sb3);
	
	
	System.out.println("------------------------------------------------");
	StringBuilder sbb1=new StringBuilder("Hello");
	StringBuilder sbb3=sbb1.append(" India");    //String Builder is also mutable so 
	System.out.println(sbb1==sbb3);
	System.out.println(sbb1+" "+sbb3);
	
	
	
	
	
}
}
