import java.util.ArrayList;
import java.util.Arrays;

public class July_29_1 {
      public ArrayList<Integer> kLargest(int[] arr, int k) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0 && k>0;i--){
            res.add(arr[i]);
            k--;
        }
        return res;
    }
}
//k largest elements