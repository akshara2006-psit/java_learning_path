// import org.w3c.dom.Node;
// public class Node{
    
// }
public class doubly_linkedlist {
     Node head;
    Node tail;
    public doubly_linkedlist(){
    this.head=null;
    this.tail=null;}
    // Traversing from head to the end of the list
    public  void traverseForward()
    {
        Node current=head;
        while(current!=null)
        {
            System.out.print(current.data);
            System.out.print("->");
            current=current.next;
        }
        System.out.print("End");
    }
    // Traversing from tail to the head
    public void tarverseBackward()
    {
        Node current=tail;
        while(current!=null)
        {
            System.out.print(current.data);
            System.out.print("->");
           current= current.prev;
        }
        System.out.print("End");
    }
    // Insert element at the beginning
    public void insertFirst(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    // insert element at end
    public void insertEnd(int data)
    {
        Node temp=new Node(data);
        if(tail==null)
        {
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }
    public static Node reverse(Node head)
    {
        if(head==null|| head.next==null)
        {
            return head;
        }
        Node currNode=head;
        Node prevNode=null;
        while(currNode!=null)
        {
            prevNode=currNode.prev;
            currNode.prev=currNode.next;
            currNode.next=prevNode;
            currNode=currNode.prev;
        }
        head=prevNode.prev;
        return head;
    }
    public static void main(String[] args) {
        doubly_linkedlist list = new doubly_linkedlistt();
        list.insertEnd(10);
        list.insertEnd(20);
        list.insertEnd(30);
        list.insertEnd(40);
        list.insertEnd(50);

        System.out.println("Original List:");
        list.traverseForward();

        list.reverse(list);
        System.out.println("Reversed List:");
        list.traverseForward();

        System.out.println("Backward Traversal:");
        list.tarverseBackward();

        // Node newnode=new Node(10);
        // newnode.next=new Node(20);
        //  newnode.next.next=new Node(30);
        //   newnode.next.next.next=new Node(40);
        //   newnode.next.next.next.next=new Node(50);
        //   reverse(newnode);
        //   traverseForward();


    }
    

   


}
//     public  void insertFirst(Node head,int val)
//     {
//         Node node=new Node(val);
//         node.next=head;
//         node.prev=null;
//         if(head!=null)
//         head.prev=node;
//         head=node;
//     }
//     public void display(Node head)
//     {
        
//         while(head!=null)
//         {
//             System.out.print(head.data);
//             System.out.print("->");
//             head=head.next;
//         }
//         System.out.print("End");
//     }
//     public static void main(String[] args) {
//         Node newnode=new Node(10);
//         newnode.next=new Node(40);
//         newnode.next.next=new Node(50);
//         insertFirst(newnode,100);
//         display(newnode);

//     }
    
// }
