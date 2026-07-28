import java.util.ArrayList;
import java.util.List;

public class July_25_2 {
   
    void solve(String digits,int index,String[] mapping,List<String> result,StringBuilder output){
        if(index>=digits.length()){
            result.add(output.toString());
            return;
        }
        int value=digits.charAt(index)-'0';
        String mappedString=mapping[value];
        for(int i=0;i<mappedString.length();i++){
            output.append(mappedString.charAt(i));
            solve(digits,index+1,mapping,result,output);
            output.deleteCharAt(output.length()-1);
        }

    }
    public List<String> letterCombinations(String digits) {
       String[] mapping={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
       List<String> result=new ArrayList<>();
       int index=0;
       StringBuilder sb=new StringBuilder();
       solve(digits,index,mapping,result,sb);
       return result;
    }
}
//Letter Combinations of a Phone Number
