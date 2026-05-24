import java.util.Scanner;
 
public class Functions{
    public static int calcfactorial(int n)
    {
        int fact=1,i;
        for(i=1;i<=n;i++)
        fact=fact*i;
        return fact;
    }
    public static void main(String[] args)
    {
     Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        //int b=sc.nextInt();
        int x=calcfactorial(a);
        System.out.println(x);
    }
}