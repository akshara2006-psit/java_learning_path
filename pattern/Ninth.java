package pattern;

import java.util.Scanner;

public class Ninth {
   public static void main(String[] args) {
    //* 
    //**
    //* *
    //*  *
    //*****
    //we have to make this pattern and take input from user
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rows:");
    int r=sc.nextInt();
    for(int i=1;i<=r;i++){
        if(i==1 || i==2 || i==r ){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
        }
        else{
            System.out.print("*");
            for(int j=0;j<i-2;j++){
                System.out.print(" ");
            }
              System.out.print("*");

        }
        System.out.println();
    }
   }

}
