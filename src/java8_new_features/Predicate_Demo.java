package java8_new_features;

import java.util.function.Predicate;

public class Predicate_Demo {
public static void main(String[] args) {
	Predicate<Integer> p=I->(I>10);
	System.out.println(p.test(100));
	System.out.println(p.test(7));
//	System.out.println(p.test(true));
	
}
}
