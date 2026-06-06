import java.util.ArrayList;
import java.util.HashSet;

public class June_6_1 {
    public static void main(String[] args) {
        int[] arr={1,4,4,5,2,2};
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            set.add(num);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i))
                list.add(i);
        }
        System.out.println("The missing elements from the array is: "+list);
    }
}
// Missing Elements From an Array of duplicates