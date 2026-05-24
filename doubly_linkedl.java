import java.util.HashMap;

public class doubly_linkedl {
    public static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(4);
        Node b=new Node(10);
        Node c=new Node(2);
        Node d=new Node(99);
        Node e=new Node(13);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
        Node head=a;
        // display(a);
        // System.out.println();
        // display_backward(e);
        // dispaly_when_random(c);
        Node newnode=new Node(500);
        head=insertion_at_head(head,newnode);
        display(head);
        HashMap<Integer,Integer>mp=new HashMap<>();
      mp.get(e)
    }
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void display_backward(Node tail)
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.print("null");
    }
    public static void dispaly_when_random(Node random){
        Node temp=random;
        while(temp.prev!=null)
        {
            temp=temp.prev;
        }
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");

    }
    public static Node insertion_at_head(Node head,Node newnode)
    {
      head.prev=newnode;
      newnode.next=head;
      head=newnode;
      head.prev=null;
  return head;
    }
    
}
