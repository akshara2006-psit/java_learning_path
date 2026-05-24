import java.util.Scanner;
public class even_number_of_digit {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(evennumber(arr));
       
    }
    static int evennumber(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(even(arr[i]))
            count++;
        }
        return count;
    }
    static boolean even(int d)
    {
        int count=0;
        while(d!=0)
        {
            d=d/10;
            count++;
        }
        if(count%2==0)
        return true;
        else
        return false;
    }
    
}
