import java.util.ArrayList;

public class Sept_3_1 {
     private void generatepow(char[] s,int index,ArrayList<String> res,StringBuilder sb){
        if(index==s.length){
            res.add(sb.toString());
            return;
        }
        sb.append(s[index]);
        generatepow(s,index+1,res,sb);
        sb.deleteCharAt(sb.length()-1);
        generatepow(s,index+1,res,sb);
    }
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> res=new ArrayList<>();
        // res.add("");
        generatepow(s.toCharArray(),0,res,new StringBuilder());
        return res;
    }
}
// Power Set Using Recursion