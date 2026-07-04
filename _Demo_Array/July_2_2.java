import java.util.ArrayList;
import java.util.HashMap;

public class July_2_2 {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
     
        ArrayList<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num:mp.keySet()){
            if(mp.get(num)==2)
            result.add(num);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        ArrayList<Integer> result=findDuplicates(arr);
        System.out.println(result);
    }
}
//Duplicates in a Limited Range
// Given an array arr[] of size n, containing elements from the range 1 to n, and each element appears at most twice, return an array of all the integers that appears twice.

// Note: You can return the elements in any order but the driver code will print them in sorted order.