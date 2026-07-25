import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class July_23_2 {
     public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n=arr.length;
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num:arr){
            if(mp.get(num)>Math.floor(n/3)){
                if(!res.contains(num))
                res.add(num);
            }
        }
        Collections.sort(res);
        return res;
    }
}
//Majority element more than n/3;
