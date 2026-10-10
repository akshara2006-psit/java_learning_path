import java.util.ArrayList;
import java.util.HashMap;

public class count_distinct_elements_in_every_window {
       ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        int n=arr.length;
        while(j<n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if((j-i+1)==k){
                list.add(map.size());
                int left=arr[i];
                map.put(left,map.get(left)-1);
                if(map.get(left)==0)
                map.remove(left);
                i++;
            }
            j++;
        }
        return list;
    }
}
// Count Distinct Elements in Every Window