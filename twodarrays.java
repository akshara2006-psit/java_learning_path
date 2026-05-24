import java.util.Scanner;
public class twodarrays
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int numbers[][]=new int [rows][cols];
        for(int i=0;i<=rows-1;i++)
        {
            for(int j=0;j<=cols-1;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
            for(int i=0;i<=rows-1;i++)
            {
                for(int j=0;j<=cols-1;j++)
                {
                   // System.out.print(numbers[i][j]+"  ");
                   if(numbers[i][j]==x)
                   System.out.print(i+" "+j);

                }
                System.out.println();
            }
        }
 }
