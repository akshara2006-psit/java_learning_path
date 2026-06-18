import java.util.ArrayList;
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
    ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class June_18_1{
  
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int l = left - 1;
        int r = right - 1;

        while (l < r) {
            int t = list.get(l);
            list.set(l, list.get(r));
            list.set(r, t);

            l++;
            r--;
        }

        temp = head;
        int i = 0;
        while (temp != null) {
            temp.val = list.get(i++);
            temp = temp.next;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        int left=2;
        int right=4;
        ListNode result=reverseBetween(head, left, right);
        ListNode temp=result;
        while(temp!=null){
 System.out.print(temp.val+" ");
 temp=temp.next;
        }
       
    }
}
// Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.
