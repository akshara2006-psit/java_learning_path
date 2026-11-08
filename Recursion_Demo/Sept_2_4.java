import java.util.ArrayList;

public class Sept_2_4 {
     public ArrayList<Integer> pattern(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        generatePattern(n, result, n);
        return result;
    }

    private void generatePattern(int current, ArrayList<Integer> result, int original) {
        
        result.add(current);

        // recursive descent until <= 0
        if (current > 0) {
            generatePattern(current - 5, result, original);
            // while unwinding recursion, add current again
            result.add(current);
        }
    }
}
// Given a number n, print a sequence of numbers starting from n. Each next number in the sequence is n - 5, and this continues recursively until the number becomes less than or equal to 0. After that, print the sequence in reverse order, adding 5 each time, until it reaches back to the original number n.
