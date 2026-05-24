import java.util.Scanner;


public class practicesheet{
   /* public static void printaverage(int i,int j,int k ){
        
        int avg=(i+j+k)/3;
        System.out.println(avg);*/
       /*  public static int summation(int n)
        {
            int sum=0;
            for(int i=1;i<=n;i++)
            {
               if(i%2!=0)
               sum=sum+i;
            }
            return sum;
        }*/
        public static void greatest(int a,int b)
        {
            if(a>b)
            System.out.println("a is greater"+a);
            else
            System.out.println("b is greater"+b);

        }
        

        

    
    public  static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
       // int c=sc.nextInt();
        //printaverage(a,b,c);
       // int x=summation(a);
       greatest(a,b);

        //System.out.println(x);
    }
}