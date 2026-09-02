import java.util.ArrayList;
import java.util.Stack;

public class Aug_16_2 {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
         ArrayList<Integer> res=new ArrayList<>();
         Stack<Integer> st=new Stack<>();
         for(int i=0;i<arr.length;i++){
             if(st.isEmpty())
             res.add(-1);
             else if(st.size()>0 && st.peek()>arr[i])
             res.add(st.peek());
             else if(st.size()>0 && st.peek()<=arr[i]){
                 while(st.size()>0 && st.peek()<=arr[i])
                 st.pop();
                 if(st.size()==0)
                 res.add(-1);
                 else
                 res.add(st.peek());
             }
             st.push(arr[i]);
         }
         return res;
    }
}
// previous greater element