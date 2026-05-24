import java.util.Scanner;

public class alphabet_case_check {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
   char ch=sc.next().trim().charAt(0);
   if(ch>='a' &&ch<='z')
   System.out.println("lowecase");
   else{
    System.out.println("uppercase");
   }


}

    
}
