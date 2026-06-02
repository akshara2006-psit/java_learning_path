import java.util.Scanner;

public class June_2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num & 1)==1){
            System.out.println(num+" is odd number");
        }
        else
            System.out.println(num+" is even number");
    }
}
//Check numberc are even or odd using bitwise operator