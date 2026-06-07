public class May_29_5 {
    private  static boolean checkPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="noon";
        if(checkPalindrome(str))
            System.out.println("Yes the string is palindrome ");
        else{
            System.out.println("the string is not palindrome");
        }
      
    }
    
}
