package demoPredicate;

import java.util.function.Predicate;

public class Program3 {
public static void main(String[] args) {
	Predicate<String> p=P->(P=="");
	System.out.println(p.test("pari"));
	System.out.println(p.test(""));
}
}
