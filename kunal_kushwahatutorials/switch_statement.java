import java.util.Scanner;


public class switch_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       /*  switch(s)
        {
            case "Mango":
            System.out.println("king of fruits");
            break;
            case "Apple":
            System.out.println("A sweet red fruit");
            break;
            case "Orange":
            System.out.println("a round fruit");
            break;
            case "Grapes":
            System.out.println("small fruit");
            break;
            default:
            System.out.println("invalid fruit");
        }*/

        //enhanced switch statement-no use of break statement
        switch(s)
        {
            case "Mango" ->System.out.println("king of fruits");
            case "Apple" ->System.out.println("A sweet red fruit");
            case "Orange" -> System.out.println("a round fruit");
            case "Grapes" ->System.out.println("small fruit");
            default ->  System.out.println("invalid fruit");
        }
    }
    
}
