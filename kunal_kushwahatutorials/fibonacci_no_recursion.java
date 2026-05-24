import java.util.Scanner;
public class fibonacci_no_recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci_number(n));
        



        
    }
    static int fibonacci_number(int n)
    {
       if(n==0 || n==1)
       return n;
       return fibonacci_number(n-1)+fibonacci_number(n-2);
    }
}
