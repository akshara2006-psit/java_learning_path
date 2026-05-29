public class May_29_3 {
    public static void main(String[] args) {
      //count vowels in a string  
      String str="Akshara";
      int count=0;
      for(char ch:str.toCharArray()){
        if(ch=='A'||ch=='E'||ch=='I' || ch=='O'|| ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'|| ch=='u')
            count++;
      }
      System.out.println("The number of vowels presnt in the string is " +count);
    }
}
