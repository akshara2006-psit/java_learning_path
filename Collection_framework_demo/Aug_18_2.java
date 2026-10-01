import java.util.Stack;

public class Aug_18_2 {
      public void deleteMid(Stack<Integer> s) {
        int ans = (s.size() + 1) / 2; 
        Stack<Integer> st = new Stack<>();

      
        for (int i = s.size(); i > ans; i--) {
            st.push(s.pop());
        }

        
        s.pop();

        while (!st.isEmpty()) {
            s.push(st.pop());
        }
    }
}
// Delete mid of stack