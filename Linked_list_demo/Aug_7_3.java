public class Aug_7_3 {
    public Node insertAtEnd(Node head, int x) {
        // code here
        
        Node temp=head;
        Node node=new Node(x);
        if(temp==null)
        return node;
        if(temp.next==null)
        {
            temp.next=node;
            return head;
        }
        
        while(temp.next!=null){
            temp=temp.next;
        }
        node.next=null;
        temp.next=node;
        return head;
    }
}
// Linked List End Insertion