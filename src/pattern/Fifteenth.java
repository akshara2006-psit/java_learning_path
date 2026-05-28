import java.util.Scanner;

public class Fifteenth {
    public static void main(String[] args) {
        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15
        //we have to print this pattern and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        int k=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k++ +" ");
            }
            System.out.println();
        }
    }
}
