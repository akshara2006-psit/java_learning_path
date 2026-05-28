import java.util.Scanner;

public class Ninteenth {
    public static void main(String[] args) {
        //   1
        //  121
        // 12321
        //1234321
        //We have to print this pattern and take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int k=r-i;k>=1;k--){
                System.out.print(" ");
            }
            if(i==1)
                System.out.print(1);
            else{
            System.out.print(1);
            int k=2;
            for(int j=1;j<=2*i-3;j++){
                if(j<(i-1)){
                    System.out.print(k++);}

                else{
                    System.out.print(k--);

                }
            }
            System.out.print(1);}

            System.out.println();
        }

    }
    
}
