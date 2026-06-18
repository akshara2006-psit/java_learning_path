import java.util.ArrayList;
import java.util.HashSet;
 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class June_18_3{
   
    public static ListNode modifiedList(int[] nums, ListNode head) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        ArrayList<ListNode> list = new ArrayList<>();

        while (head != null) {
            if (!set.contains(head.val)) {
                list.add(head);
            }
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (ListNode node : list) {
            curr.next = node;
            curr = curr.next;
        }

        curr.next = null;

        return dummy.next;
    }
    public static void main(String[] args) {
        int[] nums={1,2,3};
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
         head.next.next.next.next=new ListNode(5);
        ListNode result=modifiedList(nums, head);
        ListNode dummy=result;
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }
    }
}
// 3217. Delete Nodes From Linked List Present in Array