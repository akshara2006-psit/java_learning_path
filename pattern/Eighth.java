package pattern;

import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        //* * * * * *
        //*         *
        //*         *
        //* * * * * *
        //We want to print this pattern and take input from the user
        System.out.println("Enter rows: ");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        for(int i=0;i<r;i++){
            if(i==0 || i==r-1){
                for(int j=0;j<6;j++){
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("* ");
                for(int j=0;j<4;j++){
                    System.out.print("  ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
