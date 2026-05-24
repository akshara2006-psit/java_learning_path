import java.util.Scanner;
public class practiceseven
{
    public static void calc(int n)
    {
        int positive=0;
        int negative=0;
        int zeros=0;
        for(int i=0;i<=n-1;i++)
        {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a>0){
            positive++;}
            else if(a<0){
            negative++;}
            else{
            zeros++;}}
            System.out.println("no of positive numbers are "+positive);
            System.out.println("no of negative numbers are "+negative);
            System.out.println("no of zeros are "+zeros);
        
    }
    public static void main(String[] args)
    {
   
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        calc(n);


    }
}