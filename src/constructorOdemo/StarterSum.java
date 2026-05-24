package constructorOdemo;

import visibility_modifier.Visible;

public class StarterSum {

	public static void main(String[] args) {
		Sum s1=new Sum(4,5);
		s1.prn1();
		Sum s5=new Sum(4,6l);
//		Sum s2=new Sum(5,9,15);
//		s2.prn1();
		Sum s3=new Sum(5,9,15,17);
		s3.prn1();
//		Sum s4=new Sum(5,9.5f);
//		s4.prn1();
		
		
		
		//Visible check=new Visible();
//		System.out.println(check.a); //default
//		System.out.println(check.c); //private              
		//System.out.println(check.u); //public
//		System.out.println(check.p); //protected
}
	
}
