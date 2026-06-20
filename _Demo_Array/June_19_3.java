import java.util.ArrayList;
import java.util.List;

public class June_19_3 {
    public static List<String> pascalCase(String[] arr, String pat) {
        // code here
        List<String> res=new ArrayList<>();
        for(String word:arr){
            StringBuilder sb=new StringBuilder();
            for(char ch:word.toCharArray()){
                if(Character.isUpperCase(ch)){
                    sb.append(ch);
                }
            }
            if(sb.toString().startsWith(pat))
            res.add(word);
        }
      return res;
    }
    public static void main(String[] args) {
        String[] arr={"WelcomeGeek", "WelcomeToGeeksForGeeks", "GeeksForGeeks"};
        String pat="WTG";
        System.out.println(pascalCase(arr,pat));
    }
}
