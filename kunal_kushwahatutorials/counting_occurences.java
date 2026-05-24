import java.util.Scanner;

public class counting_occurences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            int r=n%10;
            if(r==k)
            count++;
            n=n/10;
        }
        System.out.println("there number "+k+" has occured in given number "+count+" times");
        
    }
}
