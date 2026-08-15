public class Aug_10_2 {
        public boolean isEven(Node head) {
        // code here
        Node curr =head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(count % 2==0)
        return true;
        return false;
    }

}
// Is Linked List length even