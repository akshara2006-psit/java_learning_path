import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class June_1_2 {
    public static void main(String[] args) {
        //we will work will set interface
        Set<Integer> st=new HashSet<>();
        st.add(10);
        st.add(20);
        st.add(30);
        st.add(50);
        st.add(20);
        st.add(20);
        st.add(20);
        st.add(10);
        st.add(10);
        System.out.println(st);
        //retain all delete all present in set and keeps only those which are common in both set
         Set<Integer> st2=new HashSet<>();
         st2.add(20);
         st2.add(100);
         st2.add(90);
         st2.add(56);
         st.retainAll(st2);
         System.out.println(st);

         //-----------LINKED HASHSET-----------------
         Set<Integer> Lst=new LinkedHashSet<>();
         Lst.add(10);
         Lst.add(20);
         Lst.add(30);
         Lst.add(40);
         Lst.add(50);
         Lst.add(60);
         System.out.println(Lst);
         //In linked hashset order is preserved

         //Methods
        //  Insertion:add(),addAll()
        // Access:iterator()
        // Removal: remove(),removeAll()
        //union: addAll()
        //intersection:retainAll()
        // Difference: removeAll()
                 
    }
}
