import java.util.ArrayList;

public class Aug_31_1{
     public ArrayList<Integer> fibonacciNumbers(int n) {
        ArrayList<Integer> fib = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            fib.add(fibRec(i));
        }
        return fib;
    }
    private int fibRec(int k) {
        if (k == 0) return 0;
        if (k == 1) return 1;
        return fibRec(k - 1) + fibRec(k - 2);
    }
}
// First n fibonacci numbers using recursion