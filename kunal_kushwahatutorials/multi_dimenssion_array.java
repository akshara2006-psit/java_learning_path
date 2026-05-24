import java.util.Scanner;
public class multi_dimenssion_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
    
    /*
     1 2 3 
     4 5 6 
     7 8 9
     */
     int m,n;
     m=sc.nextInt();
     n=sc.nextInt();
     int[][] ar=new int[m][n];
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            ar[i][j]=sc.nextInt();//input 2D array
        }
     }
     //now print the given array
     System.out.println("THEREFORE THE GIVEN ARRAY IS:");
     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            System.out.println(ar[i][j]);
        }
     }
     
}
}