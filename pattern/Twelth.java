import java.util.Scanner;

public class Twelth {
    public static void main(String[] args) {
        //   *
        //  * *
        // *   *
        //*     * 
        // *   *
        //  * *
        //   *
        //we have to print this patetrn and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=2*r-1;i++){
            if(i<=r){
                for(int k=1;k<=r-i;k++){
                    System.out.print(" ");
                }
                if(i==1){
                   System.out.print("*"); 
                }
                else{
                    System.out.print("*"); 
                    for(int j=1;j<=2*i-3;j++){
                          System.out.print(" ");
                    }
                      System.out.print("*"); 
                }
            }
            else{
             
                for(int k=1;k<=i-r;k++){
                    System.out.print(" ");
                }
                if(i==2*r-1){
                    System.out.print("*");
                }
                else{
                         System.out.print("*");
                            int d=2*r-i;
                         for(int j=2*(2*r-i)-3;j>=1;j--){
                            System.out.print(" ");
                         }
                          System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}
