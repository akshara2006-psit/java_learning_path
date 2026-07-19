import java.util.HashMap;

public class July_8_3 {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(mp.get(arr[i])>1)
            return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,5,3,4,3,5,6};
        int ans=firstRepeated(arr);
        System.out.println(ans);
    }
}
// Given an array arr[], find the first repeating element index. The element should occur more than once and the index of its first occurrence should be the smallest.

// Note:- The position you return should be according to 1-based indexing. 