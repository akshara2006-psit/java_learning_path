public class Aug_13_2 {
    public int getNode(Node head, int k) {
        // code here
        if(head==null)
        return -1;
        
        Node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        if(k>count)
        return -1;
        curr=head;
        for(int i=1;i<k;i++){
            curr=curr.next;
            
        }
        return curr.data;
    }
}
// Node at given index

