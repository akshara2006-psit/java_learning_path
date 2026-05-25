package Demo_dmd;

public class DemoRTP {
public static void main(String[] args) {
	RTPBase b1=new RTPBase();
	RTPDerive1 d1=new RTPDerive1();
	RTPDerive2 d2=new RTPDerive2();
	b1.toPrint(5, 10);
	d1.toPrint(10,20);
	d2.toPrint(20, 40);
	System.out.println(b1.s1);
	System.out.println(d1.s1);
	System.out.println(d2.s1);
	System.out.println("----------------------------------");
	RTPBase b2;
	b2=d1;
	b2.toPrint(23,56);
	System.out.println(b2.s1);
	b2=d2;
	b2.toPrint(45,30);
	System.out.println(b2.s1);
		
	}
}
 