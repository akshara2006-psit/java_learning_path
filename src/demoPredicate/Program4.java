package demoPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Program4 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	Predicate<Integer> p=I->(I>3);
	for(int num:list) {
		if(p.test(num))
			System.out.print(num+" ");
	}
}
}
