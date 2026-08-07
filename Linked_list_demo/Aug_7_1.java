public class Aug_7_1 {
     public int getKthFromLast(Node head, int k) {
        // code here
        Node curr=head;
        int count=0;
        
        while(curr!=null){
            count++;
            curr=curr.next;        }
             if (k > count) {
            return -1; // not enough nodes
        }
            Node temp=head;
            int half=count-k;
            
            while(half!=0){
                half--;
                temp=temp.next;
            }
            return temp.data;
    }
}
// Kth from End of Linked List
