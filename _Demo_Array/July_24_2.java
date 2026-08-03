import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class July_24_2{
     public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        Integer[] temp=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp,(a,b)->{
            if(mp.get(a)!=mp.get(b)){
                return mp.get(b)-mp.get(a);
            }
            return a-b;
        });
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:temp){
            res.add(num);
        }
        return res;
    }
}
//Sort Elements by Decreasing Frequency