// import org.w3c.dom.Node;
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
public class Aug_6_1 {
    Node reverseList(Node head) {
        // code here
        Node curr=head;
        Node prev=null,fut=null;
        while(curr!=null){
            fut=curr.next;
            curr.next=prev;
            prev=curr;
            curr=fut;
        }
        return prev;
    }
}
// reverse a linked list