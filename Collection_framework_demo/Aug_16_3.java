import java.util.ArrayList;
import java.util.Stack;

public class Aug_16_3 {
     public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int x : arr) {
            while (!st.isEmpty() && st.peek() >= x) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans.add(-1);
            } else {
                ans.add(st.peek());
            }

            st.push(x);
        }

        return ans;
    }
}
// previous smallest element