import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        //find largest of three numbers;
        /*if(a>b)
        {
            if(a>c)
            System.out.println("a is greater");
            else
            System.out.println("c is greater");
        }
        else
        {
          if(b>c)
          System.out.println("b is greater");
          else
          System.out.println("c is greater");
        
        
        }*/

        //find largest of four numbers
        int d=in.nextInt();
        if(a>b&&a>c&&a>d)
        System.out.println("a is greater");
        else if(b>a&&b>c&&b>d)
        System.out.println("b is greater");
        else if(c>a&&c>b&&c>d)
        System.out.println("c is greater");
        else
        System.out.println("d is greater");

        
    }
    
}
