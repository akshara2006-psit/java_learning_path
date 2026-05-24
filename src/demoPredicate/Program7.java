package demoPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program7 {
public static void main(String[] args) {
	List<String> names = Arrays.asList("Akshara", "Rahul", "Ankit", "John");
	Predicate<String> p=I->(I.charAt(0)=='A'&&I.length()>5);
	for(String s:names) {
		if(p.test(s))
			System.out.print(s+" ");
	}
}
}
