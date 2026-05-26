import java.util.Scanner;

public class Sixteenth {
    public static void main(String[] args) {
        //A
        //A B
        //A B C
        //A B C D
        //A B C D E
        //we have to print this pattern and take input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
    
}
