public class Aug_8_2 {
     Node reverse(Node head){
        Node prev=null;
        while(head!=null){
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public Node addOne(Node head) {
        head=reverse(head);
        Node dummyNode=new Node(0);
        Node temp=dummyNode;
        int carry=1;
        while(head!=null || carry!=0){
            int sum=carry;
            if(head!=null){
                sum +=head.data;
                head=head.next;
            }
            carry=sum/10;
            temp.next=new Node(sum%10);
            temp=temp.next;
        }
        while(head != null){
            temp.next = new Node(head.data);
            temp = temp.next;
            head = head.next;
        }
        dummyNode=reverse(dummyNode.next);
        return dummyNode;
    }
}
// Add 1 to a Linked List Number