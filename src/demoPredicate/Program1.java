package demoPredicate;
import java.sql.*;
import java.util.function.Predicate;

public class Program1 {
public static void main(String[] args) {
	Predicate<Integer> p=I->(I>18);
	System.out.println(p.test(89));
	System.out.println(p.test(12));
}
}
