import java.util.HashSet;
import java.util.Set;

public class Zero_sum_subarray {
    public boolean subArrayExists(int arr[]) {
        // code here
        int sum=-1;
        // for(int num:arr){
        //     sum=sum+num;
        //     if(sum==0)
        //     return true;
        //     if(sum<0)
        //     sum=0;
        // }
        // return false;
        // int i=0,j=0;
        // while(j<arr.length){
        //     sum=sum+arr[j];
        //     if(sum==0){
        //         return true;
        //     }
        //     if(sum<0)
        //     sum=0;
        //     if(sum>0){
        //         sum=sum-arr[i];
        //         i++;
        //     }
        //     j++;}
        //     return false;
        Set<Integer> seen = new HashSet<>();
                int prefixSum = 0;

                for (int num : arr) {
                    prefixSum += num;

                    if (prefixSum == 0 || seen.contains(prefixSum)) {
                        return true;
                    }
                    seen.add(prefixSum);
                }
                return false;
    }
}
// zero sum subarray