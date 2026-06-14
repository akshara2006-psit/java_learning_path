import java.util.Stack;

public class June_14_3 {
    public static void main(String[] args) {
        String str="MY NAME IS AKSHARA";
        String[] words=str.split(" ");
        Stack<String> st=new Stack<>();
        for(String word:words){
            st.push(word);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
            if(!st.isEmpty()){
                sb.append(" ");
            }
        }
        String ans=sb.toString();
        System.out.println("The result obtained after reverse words in a string is: ");
        System.out.println(ans);
    }
}
//reverse words in a string