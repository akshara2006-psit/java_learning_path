import java.util.Scanner;
public class search_2darray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the target you want to search for:");
        int target=sc.nextInt();
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
              if(arr[i][j]==target)
              System.out.println("the given target is present at index:"+i+"row"+j+"column");
            }
        }
        

    }
    
}
