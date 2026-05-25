package ARRAYS;

public class VaragDemo {
	void prntNum(int a,int b,int c) {
		System.out.println(a+" "+b+" "+c);
	}
	void prntnum1(int ...a) {
		for(int i:a) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		VaragDemo vd1=new VaragDemo();
		vd1.prntNum(5,4,2);
		vd1.prntnum1(1,7,8,9,3);
	}
}
