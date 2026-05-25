package Demo_dmd;
//DEMO for Compile Time Polymorphism or compile time binding or static binding  i.e METHOD OVERLOADING
public class DemoCTP {
void toPrint() {
	System.out.println("from Print1----");
	
}
void toPrint(int a,int b) {
	System.out.println("from print 2----"+a+" "+b);
}
void toPrint(String a,int b) {
	System.out.println("from print3----"+a+" "+b);
}
public static void main(String[] args) {
	DemoCTP d1=new DemoCTP();
	d1.toPrint();//this will be binded by print1
	d1.toPrint(5, 9);//this will be binded by print2
//	d1.toPrint(5,9,9);
}
}
