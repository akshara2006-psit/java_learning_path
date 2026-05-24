import java.util.ArrayList;
import java.util.Arrays;

public class lettercombinationsofaphonenumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(padlet("","23").toArray()));
        
    }

    static String[] mapping={
        "","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"
    };
    static ArrayList<String>padlet(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit=up.charAt(0)-'0';
        String letters=mapping[digit];
        
        ArrayList<String>list=new ArrayList<>();
           
      for(int i=0;i<letters.length();i++){
        char ch=letters.charAt(i);
        list.addAll(padlet(p+ch,up.substring(1)));
      }
      return list;
    }
    
}
