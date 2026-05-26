import java.util.Scanner;

public class Twentieth {
    public static void main(String[] args) {
        //   1
        //  222
        // 33333
        //4444444
        //We have to print this patetrn and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int k=r-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
                System.out.print(i);
            System.out.println();
        }
    }
}
