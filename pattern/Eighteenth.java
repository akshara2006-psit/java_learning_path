import java.util.Scanner;

public class Eighteenth {
    public static void main(String[] args) {
        //* * * * * * * 1
        //  * * * * *  2
        //    * * *  3
        //      *   4
        //    * * *  5
        //  * * * * *  6
        //* * * * * * * 7
        //we have to print this pattern and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<2*r;i++){
            if(i<=r){
                for(int k=1;k<i;k++){
                    System.out.print("  ");
                }
                
                for(int j=2*(2*r-i)-7;j>=1;j--){
                    System.out.print("* ");
                    
                }
              
            }
            else{
                for(int k=2*r-i-1;k>=1;k--)
                {
                    System.out.print("  ");
                }
                for(int j=1;j<=2*i-7;j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
