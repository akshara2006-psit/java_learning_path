import java.util.HashMap;
import java.util.List;

public class Sept_1_2 {
        public int moreFrequent(List<Integer> arr, int x, int y) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num:arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        int mini=Math.min(x,y);
        if(mp.getOrDefault(x,0)==mp.getOrDefault(y,0))
        return mini;
        if(mp.getOrDefault(x,0)<mp.getOrDefault(y,0))
        return y;
        return x;
    }
}
// who has the majority??