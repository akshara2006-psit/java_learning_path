import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class July_4_2 {
      public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<ArrayList<Integer>> pairs = new HashSet<>();
        
        for (int num : arr) {
            if (seen.contains(-num)) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(Math.min(num, -num));
                pair.add(Math.max(num, -num));
                pairs.add(pair); 
            }
            seen.add(num);
        }
        
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(pairs);
        
        result.sort((a, b) -> {
            if (!a.get(0).equals(b.get(0))) return a.get(0) - b.get(0);
            return a.get(1) - b.get(1);
        });
        
        return result;
    }
    public static void main(String[] args) {
      int[]  arr = {-1, 0, 1, 2, -1, -4};
      ArrayList<ArrayList<Integer>> result=getPairs(arr);
      System.out.println(result);
    }
}
// Two sum -Pairs with 0 Sum
