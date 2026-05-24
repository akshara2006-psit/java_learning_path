package demoPredicate;

import java.util.function.Predicate;

public class Program6 {
public static void main(String[] args) {
	Predicate<Integer> p=I->(I>10 && I%2==0);
	System.out.println(p.test(56));
	System.out.println(p.test(9));
	System.out.println(p.test(39));
	System.out.println(p.test(4));
}
}
