import java.util.Scanner;

public class June_2_4 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1=num1^num2;
        num2=num1^num2;
        num1=num1^num2;
          
        System.out.println(num1);
        System.out.println(num2);
    }
}
//Swap two number