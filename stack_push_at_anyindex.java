import java.util.Stack;

public class stack_push_at_anyindex {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        int ind=3;
        int data=0;
        Stack<Integer>c=new Stack<>();
        while(st.size()>=ind){
        c.push(st.pop());
        }
        st.push(data);
        //  Stack<Integer>r=new Stack<>();
        //  while(c.size()>0)
        //  {
        //     r.push(c.pop());
        //  }
        while(c.size()>0)
         {
            st.push(c.pop());
         }
         System.out.println(st);

    }
    
}
