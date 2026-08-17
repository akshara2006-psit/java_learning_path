import java.util.HashMap;

public class Aug_10_2 {
    char firstRep(String S) {
        // your code here
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:S.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c:S.toCharArray()){
            if(mp.get(c)>1)
            return c;
        }
        return '#';
    }
}
// First reepeating character