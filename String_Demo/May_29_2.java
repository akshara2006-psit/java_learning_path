public class May_29_2 {
    public static void main(String[] args) {
        //count length of string without length()
        String str="Akshara";
        int i=0;
        char[] ch=str.toCharArray();
       for(char c:ch){
        i++;
       }
       System.out.println("The length of the string is: "+i);
    }
}
