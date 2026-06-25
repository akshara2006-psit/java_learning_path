import java.util.Scanner;

public class Thirdp {
    public static void print_number(int n){
        int i=n;
        if(i==0)
        return;
        print_number(i-1);
        System.out.print(i+" ");
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print_number(n);
        
        
    }
    
}
