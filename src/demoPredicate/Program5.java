package demoPredicate;

import java.util.function.Predicate;

public class Program5 {
public static void main(String[] args) {
	Predicate<String> p=I->(I.charAt(0)=='A');
	System.out.println(p.test("Akshara"));
	System.out.println(p.test("Radhe"));
}
}
