import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;



public class queueintro {
   public static void main(String[] args) {
    ArrayList<Integer>al=new ArrayList<>();
    Stack<Integer>st=new Stack<>();
    // Queue<Integer>q=new ArrayDeque<>();
    //or 
    Queue<Integer>q=new LinkedList<>();
    System.out.println(q.isEmpty());
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q.isEmpty());
    System.out.println(q);
    System.out.println(q.size());
    q.remove();
    System.out.println(q);
    System.out.println(q.peek());
    System.out.println(q.element());
    q.poll();
    System.out.println(q);

   } 
}
 