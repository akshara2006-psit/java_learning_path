import java.util.Scanner;

public class greet {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      String your_name=sc.nextLine();
      String greeting=greet(your_name);
      System.out.println(greeting);

    }
    static String greet(String name)//string return type function
    {
        String message="HELLO!"+name;
        return message;
    }
}
