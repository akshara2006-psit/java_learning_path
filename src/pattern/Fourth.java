// package pattern;

import java.util.Scanner;

public class Fourth {
 public static void main(String[] args) {
    //    * * * * *
    //   * * * * *
    //  * * * * *
    // * * * * *
    //* * * * *
    //we have to print this program take rows and columns input from user
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int r=sc.nextInt();
    System.out.println();
     System.out.print("Enter the number of columns: ");
    int c=sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int k=1;k<=r-i;k++){
            System.out.print(" ");
        }
        for(int j=1;j<=c;j++){
            System.out.print("* ");
        }
        System.err.println();
    }
 }   
}
