import java.util.Scanner;
public class max_wealth {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(maxwealth(arr));


    }
    static int maxwealth(int[][] arr)
    {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=0;j<arr[i].length;j++)
            {
            sum=sum+arr[i][j];
            }
            if(sum>ans)
            ans=sum;
        }
        return ans;
    }
    
}
