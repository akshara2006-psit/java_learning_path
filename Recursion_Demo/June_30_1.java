import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class June_30_1 {
   
    static void getAllSubsequences(String s,int index,StringBuilder output,List<String> ans){
        if(index>=s.length()){
            String subsequence=output.toString();
            ans.add(subsequence);
            return;
        }
        char ch=s.charAt(index);
        output.append(ch);
        getAllSubsequences(s,index+1,output,ans);
        output.deleteCharAt(output.length()-1);
        getAllSubsequences(s,index+1,output,ans);
        
    }
    public static List<String> powerSet(String s) {
        // Code here
        List<String> ans=new ArrayList<>();
        StringBuilder output=new StringBuilder();
        int index=0;
        getAllSubsequences(s,index,output,ans);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        String s="abc";
        List<String> result=powerSet(s);
        for(String str:result){
            System.out.print(str+" ,");
        }
    }
}
