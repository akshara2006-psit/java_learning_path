import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class June_15_1 {
    public static void main(String[] args) {
        String str="testsample";
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:str.toCharArray()){
            mp.put(c,mp.getOrDefault(c, 0)+1);
        }
        int maxi=Integer.MIN_VALUE;
        for(int num:mp.values()){
            maxi=Math.max(maxi, num);
        }
        ArrayList<Character> list=new ArrayList<>();
        for(char c:mp.keySet()){
            if(mp.get(c)==maxi){
                list.add(c);
            }
        }
        Collections.sort(list);
        System.out.println("the most frequent character is: "+list.get(0));
    }
}
//most frequent character