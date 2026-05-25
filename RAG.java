import java.util.*;

public class RAG {

    static Map<String, List<String>> graph = new HashMap<>();

    public static void addEdge(String from, String to) {
        graph.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
    }

    public static void main(String[] args) {

        // Student Details
        System.out.println("Name: Akshara Gupta");
        System.out.println("Roll No: 2401640100125");
        System.out.println("Class: CS 2A (ELITE)\n");

        addEdge("P1", "R1");
        addEdge("R1", "P2");
        addEdge("P2", "R2");

        for (String node : graph.keySet()) {
            System.out.println(node + " -> " + graph.get(node));
        }
    }
}