package demoPredicate;

import java.util.function.Predicate;

public class Program2 {
public static void main(String[] args) {
	Predicate<Integer> p=n->(n%2==0);
	System.out.println(p.test(9));
	System.out.println(p.test(4));
}
}
