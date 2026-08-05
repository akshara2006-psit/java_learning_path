import java.util.HashMap;

public class July_25_1 {
 
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s.toCharArray()){
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(mp.get(c)==1){
                return c;
            }
        }
        return '$';
    }


}
//non-repeating character