import java.util.Stack;
import java.util.Scanner;

public class movestackinsameorder {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the elements you want to insert");
        n=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=n;i++)
        {
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        Stack<Integer>gt=new Stack<>();
        while(st.size()>0)
        {
            gt.push(st.pop());
        }
        System.out.println(gt);
       
        Stack<Integer>copied=new Stack<>();
        while(gt.size()>0)
        {
          copied.push(gt.pop());
        }
        System.out.println("the required stack is:");
        System.out.println(copied);
    }
    
}
