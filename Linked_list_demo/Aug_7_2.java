public class Aug_7_2 {
    int getMiddle(Node head) {
        // code here
        Node temp=head;
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        int mid=count/2;
        while(mid!=0){
            mid--;
            temp=temp.next;
        }
        return temp.data;
    }
}
// return the mid of the linkedlist
