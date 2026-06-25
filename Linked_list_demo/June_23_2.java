class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class June_23_2 {
   
    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public static ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            int g = gcd(curr.val, curr.next.val);

            ListNode node = new ListNode(g);
            node.next = curr.next;
            curr.next = node;

            curr = node.next;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(18);
        head.next=new ListNode(6);
        head.next.next=new ListNode(10);
        head.next.next.next=new ListNode(3);
        ListNode result=insertGreatestCommonDivisors(head);
        while(result!=null){
            System.out.print(result.val+" ");
            result=result.next;
        }
    }
}
// Given the head of a linked list head, in which each node contains an integer value.

// Between every pair of adjacent nodes, insert a new node with a value equal to the greatest common divisor of them.

// Return the linked list after insertion.

// The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

