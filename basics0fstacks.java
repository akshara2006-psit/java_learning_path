import java.util.Stack;

public class basics0fstacks {
    
    public static void main(String[] args)
    {
        Stack<Integer>st=new Stack<>();
        System.out.println(st.isEmpty());//true
        st.push(34);
        st.push(99);
        st.push(89);
        System.out.println(st.peek());//89
        System.out.println(st);
        System.out.println(st.isEmpty());//false
        System.out.println("the size of the stack is:"+st.size());
    }
    
}
