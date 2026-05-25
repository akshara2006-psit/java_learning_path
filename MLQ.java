import java.util.*;

public class MLQ {

    public static void roundRobin(Queue<Integer> q, int tq) {
        while (!q.isEmpty()) {
            int bt = q.poll();
            if (bt > tq) {
                System.out.println("Executed for " + tq);
                q.add(bt - tq);
            } else {
                System.out.println("Executed for " + bt);
            }
        }
    }

    public static void fcfs(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.println("Executed for " + q.poll());
        }
    }

    public static void main(String[] args) {

        // Student Details
        System.out.println("Name: Akshara Gupta");
        System.out.println("Roll No: 2401640100125");
        System.out.println("Class: CS 2A (ELITE)\n");

        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(5, 3));
        Queue<Integer> q2 = new LinkedList<>(Arrays.asList(6, 4));
        Queue<Integer> q3 = new LinkedList<>(Arrays.asList(7, 2));

        System.out.println("Level 1 (TQ=2):");
        roundRobin(q1, 2);

        System.out.println("\nLevel 2 (TQ=4):");
        roundRobin(q2, 4);

        System.out.println("\nLevel 3 (FCFS):");
        fcfs(q3);
    }
}