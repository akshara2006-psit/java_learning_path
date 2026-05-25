package java8_new_features;

public class Demo implements DemoNoLanmbda{
public static void main(String[] args) {
	DemoNoLanmbda  d1=new Demo();
	d1.m1();
}

@Override
public void m1() {
	System.out.println("from m1()");
	
}
}
