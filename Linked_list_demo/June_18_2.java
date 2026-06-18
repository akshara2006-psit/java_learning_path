import java.util.ArrayList;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class June_18_2 {
    public static ListNode deleteMiddle(ListNode head) {
         if (head == null || head.next == null)
            return null;
        ArrayList<Integer> list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int n=list.size();
        int idx=n/2;
        list.remove(idx);
        ListNode newhead=new ListNode(list.get(0));
        temp=newhead;
       for(int i=1;i<list.size();i++){
        temp.next=new ListNode(list.get(i));
        temp=temp.next;
       }
        return newhead;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        ListNode result=deleteMiddle(head);
        ListNode temp=result;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
//delete the middle node of a linked list