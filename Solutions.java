import java.util.Scanner;
public class Solutions{
    public static int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b){
               a=a-b;}
            else{
                b=b-a;
            }
        }
return b;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        int x=gcd(a,b);
        System.out.println(x);
    }
    
}