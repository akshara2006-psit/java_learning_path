import java.util.Scanner;

public class Thirteenth {
    public static void main(String[] args) {
        //*      *
        //**    **
        //***  ***
        //********
        //********
        //***  ***
        //**    **
        //*      * 
        //we have to print this pattern and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=2*r;i++){
            if(i<=r){
                if(i==r){
                    for(int j=1;j<=2*r;j++){
                        System.out.print("*");
                    }
                }
                else{
                    for(int j=1;j<=i;j++){
                          System.out.print("*");
                    }
                    for(int k=2*r-2*i;k>=1;k--){
                        System.out.print(" ");
                    }
                     for(int j=1;j<=i;j++){
                          System.out.print("*");
                    }

                }
            }
            else{
                if(i==r+1){
                    for(int j=1;j<=2*r;j++){
                        System.out.print("*");
                    }
                }
                else{
                    for(int j=(2*r-i)+1;j>=1;j--){
                        System.out.print("*");
                    }
                    for(int k=1;k<=2*(i-r)-2;k++){
                        System.out.print(" ");
                    }
                    for(int j=(2*r-i)+1;j>=1;j--){
                        System.out.print("*");
                    }

                }
            }
            System.out.println();
        }

    }
    
}
