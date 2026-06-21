import java.util.ArrayList;

public class June_20_1 {
    public static boolean isPalinSent(String s) {
        // code here
        ArrayList  list=new ArrayList();
        for(char c:s.toCharArray()){
            if(Character.isLetter(c)){
                list.add(Character.toLowerCase(c));
            }
            else if(Character.isDigit(c)){
                list.add(c);
            }
        }
        int l=0;
        int r=list.size()-1;
        while(l<=r){
            if(list.get(l)!=list.get(r))
            return false;
            l++;
            r--;
        }
        return true;
        
    }
    public static void main(String[] args) {
        String s="Too hot to hoot";
        if(isPalinSent(s)){
            System.out.println("Yes it is a palindrome sentence");
        }
        else{
            System.out.println("No it is not a palindrome sentence");
        }
    }
}
// Given a single string s, the task is to check if it is a palindrome sentence or not.
// A palindrome sentence is a sequence of characters, such as word, phrase, or series of symbols that reads the same backward as forward after converting all uppercase letters to lowercase and removing all non-alphanumeric characters (including spaces and punctuation).