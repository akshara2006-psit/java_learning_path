import java.util.Scanner;

public class sum_by_function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        num1=sc.nextInt();
        num2=sc.nextInt();
        int sum=sum(num1,num2);
        System.out.println(sum);
        
    }
    static int sum(int a,int b)//with argument and return type function
    {
        int sum;
        sum=a+b;
        return sum;
    }
    
}
