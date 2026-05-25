package java8_new_features;
class Sample{
	private String s;
	Sample(String s){
		this.s=s;
		System.out.println("Constructore Executed:"+s);
		
	}
}
@FunctionalInterface
interface Interf{
	public Sample get(String s);

	
}
public class ConstructorReference {
public static void main(String[] args) {
	Interf f=s->new Sample(s);
	f.get("From lambda expression..");
	Interf f1=Sample::new;
	f.get("From Constructore Reference");
}
}