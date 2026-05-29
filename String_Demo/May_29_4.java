public class May_29_4 {
    public static void main(String[] args) {
        //reverse a string
        String str="Akshara";
        int n=str.length();
        char[] ch=str.toCharArray();
        for(int i=0;i<n/2;i++){
            char temp=ch[i];
            ch[i]=ch[n-i-1];
            ch[n-i-1]=temp;
        }
        String reversed=new String(ch);
        System.out.println("the reversed string is "+reversed);
    }
    
}
