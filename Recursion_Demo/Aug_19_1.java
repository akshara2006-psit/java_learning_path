import java.util.Stack;

public class Aug_19_1 {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.size()<=1)
        return;
        int top=st.pop();
        sortStack(st);
        insertStack(st,top);
    }
    private void insertStack(Stack<Integer> st,int key){
        if(st.isEmpty() || st.peek()<=key){
        st.push(key);
        return;}
        int top=st.pop();
        insertStack(st,key);
        st.push(top);
    }
}
// sort a stack using recursion