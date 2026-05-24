public class single_ll {
    public static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
       
    }
    public static void main(String[] args) {
        Node a= new Node(5);
        Node b=new Node(3);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        // e.next=null;
        Node head=a;
        printll(head);
        System.out.println(length(head));
        Node target1=new Node(100);
        Node target2=new Node(200);
         printll(insertLast(head,target1));
         printll(head);
        printll(insertFront(head, target2)) ;
        System.out.println();
        head=insertFront(head, target2);
        printll(head);
        //  printll(head);
        int pos=2;
        Node target3=new Node(500);
        printll(insertbetween(head,pos,target3));
        System.out.println();
        printll(head);


    }
    public static void printll(Node head)
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data);
            System.out.print("->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public static int length(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
    public static Node insertLast(Node head,Node target)
    {
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=target;
        curr.next.next=null;
       return head;

    }
    public static Node insertFront(Node head,Node target)
    {
        Node temp=head;
        // temp.next=head;
        head=target;
        head.next=temp;
         return head;
    }
    public static Node insertbetween(Node head,int pos,Node target)
    {
        Node curr=head;
        for(int i=1;i<pos-1&&curr!=null;i++)
         {
          curr=curr.next;
         }
         Node temp=curr.next;
         curr.next=target;
         curr.next.next=temp;
         return head;

    }
}
