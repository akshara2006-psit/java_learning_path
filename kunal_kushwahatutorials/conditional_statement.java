import java.util.Scanner;

public class conditional_statement{
    public static void main(String [] args)
    {
       Scanner in= new Scanner(System.in);
       int salary=in.nextInt();
       if(salary>10000 && salary<11000)
       {
        salary=salary+2000;
       }
       else if(salary>20000)
       salary=salary+3000;
       else
       salary=salary+1000;

       System.out.println(salary);
    }
}