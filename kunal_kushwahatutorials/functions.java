import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        sum();
        
    }
    static void sum()//no argument and no return type function
    {
      System.out.println("enter a number:");
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       System.out.println("enter a number:");
       int num2 = sc.nextInt();
       int sum=num1+num2;
       System.out.println("the sum of two numbers is:"+sum);


    }
}
