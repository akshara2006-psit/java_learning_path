// package pattern;

import java.util.Scanner;

public class Second {
 public static void main(String[] args){
    // * * * * *
    // * * * * *
    // * * * * *
    //we want to print this pattern make a program taking rows and columns input from the user
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int r=sc.nextInt();
    System.out.println();
     System.out.print("Enter the number of columns: ");
    int c=sc.nextInt();
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
 }

}
