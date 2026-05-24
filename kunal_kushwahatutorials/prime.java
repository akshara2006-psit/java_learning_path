import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n))
        System.out.println("the given no "+n+" is prime");
        else
                System.out.println("the given no "+n+" is not prime");

        
    }
    static boolean isprime(int n)
    {
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            c=1;


        }
        if(c==0)
        return true;
        else
        return false;
    }
}
