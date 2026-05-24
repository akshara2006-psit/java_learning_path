import java.util.Stack;
public class push_at_bottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
         Stack<Integer>d=new Stack<>();
         while(st.size()>0)
         {
            d.push(st.pop());
         }
         st.push(0);
         while(d.size()>0){
            st.push(d.pop());

         }
         System.out.println(st);



    }
}

