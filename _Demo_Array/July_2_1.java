import java.util.ArrayList;
import java.util.Collections;

public class July_2_1 {
     static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int maxSoFar = arr[n - 1];

        ans.add(maxSoFar);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxSoFar) {
                ans.add(arr[i]);
                maxSoFar = arr[i];
            }
        }

        Collections.reverse(ans);
        return ans; 
    }
    public static void main(String[] args) {
        int[] arr={16, 17, 4, 3, 5, 2};
        ArrayList<Integer> result=leaders(arr);
        System.out.println(result);
    }


}
//Array Leaders