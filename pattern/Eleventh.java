import java.util.Scanner;

public class Eleventh {
    public static void main(String[] args) {
        //   *
        //  ***
        // *****
        //*******
        // *****
        //  ***
        //   *
        // we have to print this pattern and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<2*r;i++){
            if(i<=r){
                for(int k=1;k<=r-i;k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("*");
                }
              
            }
            else{
                for(int k=1;k<=i-r;k++){
                        System.out.print(" ");
                }
                int d=2*r-i;
                for(int j=2*d-1;j>=1;j--){
                    System.out.print("*");
                }
            }
              System.out.println();
        }
    }
}
