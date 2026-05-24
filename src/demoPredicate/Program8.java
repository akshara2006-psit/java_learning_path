package demoPredicate;

import java.util.function.Predicate;

public class Program8 {
public static void main(String[] args) {
	Predicate<Integer> isPrime = num -> {
        if (num <= 1) return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    };
    System.out.println(isPrime.test(7));  
    System.out.println(isPrime.test(10)); 
}
}
