
  public class Aug_10_1 {  
}
class Node {
    int data;
    Node next;

    Node(int val) {
        data = val;
        next = null;
    }
}

class myQueue {
    Node dummy;

    public myQueue() {
        dummy = new Node(0);
    }

    public boolean isEmpty() {
        return dummy.next == null;
    }

    public void enqueue(int x) {
        Node newNode = new Node(x);

        Node curr = dummy;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
    }

    public void dequeue() {
        if (dummy.next == null) {
            return;
        }
        dummy.next = dummy.next.next;
    }

    public int getFront() {
        if (dummy.next == null) {
            return -1;
        }

        return dummy.next.data;
    }

    public int size() {
        Node curr = dummy.next;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        return count;
    }
}
//Queue using linked list