import java.util.Stack;

public class June_23_1 {
    public static ListNode removeNodes(ListNode head) {

        Stack<ListNode> st = new Stack<>();

        ListNode curr = head;

        while (curr != null) {

            while (!st.isEmpty() && st.peek().val < curr.val) {
                st.pop();
            }

            st.push(curr);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(0);
        curr = dummy;

        for (ListNode node : st) {
            curr.next = node;
            curr = curr.next;
        }

        curr.next = null;

        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(5);
        head.next=new ListNode(2);
        head.next.next=new ListNode(13);
        head.next.next.next=new ListNode(3);
         head.next.next.next.next=new ListNode(8);
        ListNode result=removeNodes(head);
        ListNode dummy=result;
        while(dummy!=null){
            System.out.print(dummy.val+" ");
            dummy=dummy.next;
        }
    }
}
// You are given the head of a linked list.

// Remove every node which has a node with a greater value anywhere to the right side of it.

// Return the head of the modified linked list.