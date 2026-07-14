import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class July_6_3 {
     public static List<Integer> frequencyCount(int[] arr) {
        // code here
        int n=arr.length;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            result.add(mp.getOrDefault(i,0));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,3,2,3,5};
        List<Integer> result=frequencyCount(arr);
        System.out.println(result);
    }
}
// You are given an array arr[] containing positive integers. The elements in the array arr[] range from  1 to n (where n is the size of the array), and some numbers may be repeated or absent. Your have to count the frequency of all numbers in the range 1 to n and return an array of size n such that result[i] represents the frequency of the number i (1-based indexing).