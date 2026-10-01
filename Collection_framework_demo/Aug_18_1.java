import java.util.Stack;

public class Aug_18_1{
 Stack<Integer> s;
    Stack<Integer> st;
    public Aug_18_1() {
        // Define Stack
        s=new Stack<>();
        st=new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        s.push(x);
        if(st.isEmpty()|| st.peek()>=x)
        st.push(x);
    }

    public void pop() {
        // Remove the top element from the Stack
     if(!s.isEmpty()) {
     int ans = s.pop();
     if(!st.isEmpty() && st.peek() == ans) {
         st.pop();
     }
    }}

  public int peek() {
      return s.isEmpty() ? -1 : s.peek();
  }

  public int getMin() {
      return st.isEmpty() ? -1 : st.peek();
  }
    boolean isEmpty() {
        // Check if the stack is empty
        return s.isEmpty();
    }
}
// Implementation of Min Stack