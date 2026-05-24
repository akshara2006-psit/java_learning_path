package instanceBlock;

public class MethodDemoStarter {
	public static void main(String[] args) {
		MethodDemo s1=new MethodDemo();
	System.out.println(	s1.add(6,5));
//		System.out.println(s1.sub(9,5));
//		MethodDemo md1=s1.add(6,5);
//		MethodDemo md1=s1.add(new ABC(),new ABC());
//		System.out.println(md1.mul());
		s1.setA(10);
		s1.setB(20);
		System.out.println(s1.mul());
		
//		String st1="Hello";
//		String st2="ABC";
//		String st3="Hello";
//		System.out.println(st1.hashCode());
//		System.out.println(st2.hashCode());
//		System.out.println(st3.hashCode());
		
	}
	class ABC{
		 
	}

}
  