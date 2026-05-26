import java.util.Scanner;

public class Seventeenth {
    public static void main(String[] args) {
        //E
        //E D
        //E D C
        //E D C B
        //E D C B A
        //we have to print this pattern and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int r=sc.nextInt();
        int n=r;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(64+n-j+1)+" ");
            }
            System.out.println();
        }
    }

}
