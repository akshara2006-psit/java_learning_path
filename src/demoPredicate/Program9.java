package demoPredicate;

import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
}
public class Program9 {
public static void main(String[] args) {
	Employee e=new Employee();
	Predicate<Integer> p=I->(I>50000);
	e.salary=80000;
	System.out.println(p.test(e.salary));
	
}
}
