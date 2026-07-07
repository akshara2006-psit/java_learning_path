import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class July_4_1 {
     public static ArrayList<Integer> findUnion(int a[], int b[]) {
          HashSet<Integer> set = new HashSet<>();
        
        // Add all elements from both arrays
        for (int num : a) {
            set.add(num);
        }
        for (int num : b) {
            set.add(num);
        }
        
        // Convert to ArrayList and sort
        ArrayList<Integer> result = new ArrayList<>(set);
        Collections.sort(result);
        
        return result;
    }
    public static void main(String[] args) {
      int  a[] = {1, 2, 3, 4, 5};
      int b[] = {1, 2, 3, 6, 7};
      ArrayList<Integer> result=findUnion(a, b);
      System.out.println(result);
    }
}//UNION OF 2 SORTED ARRAYS