package Function_demo;

import java.util.function.Function;

public class Program1 {
public static void main(String[] args) {
	Function<String,Integer> f=s->s.length();
	System.out.println(f.apply("Akshara"));
	System.out.println(f.apply("Java"));
	
}
}
