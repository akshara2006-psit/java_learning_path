package java8_new_features;
@FunctionalInterface
public interface FunctionalInterfaceDemo {
	public void add();  //SAM(SINGLE ABSTRACT METHOD)
default void sub() {
	System.out.println("from sub...");
}
default void mul() {
	System.out.println("from mul");
}
static void div() {
	System.out.println("from div..");
}
}
@FunctionalInterface
interface ABC extends FunctionalInterfaceDemo{
//public void sub();
}
class PQR implements ABC{

	@Override
	public void add() {
		System.out.println("from add");
		
	}
	@Override
	public void sub() {
		System.out.println("from add in implementation");
		
	}
	//static methods can not be overrided 
}