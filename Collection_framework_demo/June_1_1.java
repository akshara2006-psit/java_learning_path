import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class June_1_1 {
    public static void main(String[] args) {
    // we will learn queue interface
    Queue<Integer> q=new LinkedList<>();
    q.add(2);
    q.offer(4);
    q.offer(6);
    q.offer(8);
    q.offer(10);
    // both add and offer are used to insert the element in the queue
    // add()-> insert the specified elemet in the queue if the task is successful add() return true if not it throws an exception
    // offer() -> inserts the specified element into the queue if the task is successful offer() returns true if not it returns false;

    System.out.println(q.element());
    System.out.println(q.peek());
    //both elememt and peek() return the head of the queue 
    // element() give exception if the queue is empty()
    //peek() return null if the queue is empty()
System.out.println(q.remove());
System.out.println(q.poll());
// both remove and poll remove and return the head of the queue
// remove-> return exception if the queue is empty
//poll -> return null if the queue is empty
System.out.println(q);

// ------------VARIOUS IMPLEMENTATION OF QUEUE---------------
//Linked List implementation of the queueu
Queue<String> q2=new LinkedList<>();
//Array Implementation of the Queue
Queue<String>  q3=new ArrayDeque<>();
//Priority Queue Implementation of queue
Queue<String> q4=new PriorityQueue<>();

//--------------DEQUE-------------
Deque<Integer> dq=new ArrayDeque<>();
dq.offer(10);
dq.offerFirst(20);
dq.offerLast(30);
System.out.println(dq);
dq.pollLast();
System.out.println(dq);
dq.pollFirst();
System.out.println(dq);
//------------PRIORITY QUEUE------------------
Queue<Integer> pq=new PriorityQueue<>();
//default bhevaiout integers ke case meie less value high priority-> minheap
//maxheap-> integers-> high value-. high priority
pq.offer(40);
pq.offer(30);
pq.offer(20);
pq.offer(10);
System.out.println(pq);
pq.poll();
System.out.println(pq);
    }
}
