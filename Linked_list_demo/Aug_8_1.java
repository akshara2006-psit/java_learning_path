public class Aug_8_1 {
     public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public boolean isPalindrome(Node head) {

        // Create a copy of the original list
        Node dummyHead = new Node(0);
        Node tail = dummyHead;

        Node temp = head;
        while (temp != null) {
            tail.next = new Node(temp.data);
            tail = tail.next;
            temp = temp.next;
        }
        Node rev = reverse(dummyHead.next);

        // Compare original and reversed copy
        Node p1 = head;
        Node p2 = rev;

        while (p1 != null && p2 != null) {
            if (p1.data != p2.data)
                return false;

            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
//Palindrome Linked List