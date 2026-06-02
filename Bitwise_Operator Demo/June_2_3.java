import java.util.Scanner;

public class June_2_3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((num & num-1)==0)
            System.out.println("It is Power of 2");
        else
            System.out.println("it is not power of 2");
    }
}
//Check Power of 2