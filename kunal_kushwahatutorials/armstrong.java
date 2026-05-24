public class armstrong {
    public static void main(String[] args)
    {
        for(int i=100;i<=999;i++)
        { 
            if(i==isarmstrong(i))
            {
                System.out.println(i);
            }
        }
       
    }
    static int isarmstrong(int n)
    {
        int sum=0,temp=n;
        while(n!=0)
        {
            int r=n%10;
             sum=sum+r*r*r;
             n=n/10;
        }
        n=temp;
      return sum;
    }
    
}
