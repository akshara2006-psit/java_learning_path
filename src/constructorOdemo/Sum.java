	package constructorOdemo;

public class Sum {
int a,b,c,d;
long m;
float f1,f2,f3,f4;
//long sum;
float sum;
Sum(int a,long m){
	System.out.println("from c1");
}
// Constructor overloading in terms of number of parameters
Sum(int a,int b){
sum=a+b;
this.prn1();
}
Sum(int a,int b,int c){
	this(a,b);
	sum=a+b+c;
	this.prn1();
}
Sum(int a,int b,int c,int d){
	this(a,b,c);  //like Sum(a,b,c) //this() constructor
	
	sum=a+b+c+d;
	
	this.prn1();
}
// Constructor overloading in terms of types of  parameters
Sum(int a,float f1){
	sum=a+f1;
}

	

void prn1() {
	System.out.println("sum of numbers: "+sum);
}

}
