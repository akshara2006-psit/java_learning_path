package instanceBlock;

public class IIBDemo4 {
int a;
{
	a=9;  			//this is instance block
	System.out.println("Hello! a is : "+a);
	
}
{
	System.out.println("Hello from IIB2");		//this is second instance block
}
static {
	int m=5;
	System.out.println("Hello from static "+m);  		//this always runs first before object creation 
	
}
IIBDemo4(int k){
	a=k;
	System.out.println("Constructor");
	System.out.println("the value of a is: "+a);
}
static void prn() {
	System.out.println("from static method");
}
public static void main(String args[]) {
	IIBDemo4 c1=new IIBDemo4(4);
	prn();
	IIBDemo4.prn();
}
}
