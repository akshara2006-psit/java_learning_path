// package pattern;

import java.util.Scanner;

public class Tenth {
    public static void main(String[] args) {
        //    *
        //   * *
        //  *   *
        // *     *
        //*********
        // we have to print this pattern take input from user
        System.out.println("Enter rows: ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int k=1;k<=r-i;k++){
                System.out.print(" ");
            }
            if(i==1 || i==r){
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1;j<=2*i-3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
