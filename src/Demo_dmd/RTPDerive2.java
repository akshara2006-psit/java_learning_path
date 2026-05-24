package Demo_dmd;

public class RTPDerive2 extends RTPBase{
	String s1="Derived 2";
	void toPrint(int a,int b) {
		System.out.println(" RTPDERIVE 2  from print 1----"+a+" "+b);
		super.toPrint(500, 1000);
	}
}
