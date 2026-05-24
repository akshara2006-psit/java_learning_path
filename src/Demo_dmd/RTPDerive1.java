package Demo_dmd;

public class RTPDerive1 extends RTPBase{
	String s1="Derived 1";
	void toPrint(int a,int b) {
		System.out.println(" RTP DERIVE1 from print 2----"+a+" "+b);
		super.toPrint(100,200);
	}
}
