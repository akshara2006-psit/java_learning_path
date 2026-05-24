import java.util.*;

public class RAGtoWFG {

    static Map<String, List<String>> rag = new HashMap<>();
    static Map<String, List<String>> wfg = new HashMap<>();

    public static void addEdge(String from, String to) {
        rag.computeIfAbsent(from, k -> new ArrayList<>()).add(to);
    }

    public static void convertToWFG() {
        for (String node : rag.keySet()) {
            if (node.startsWith("P")) {
                for (String res : rag.get(node)) {
                    if (rag.containsKey(res)) {
                        for (String p : rag.get(res)) {
                            if (p.startsWith("P")) {
                                wfg.computeIfAbsent(node, k -> new ArrayList<>()).add(p);
                            }
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {

        // Student Details
        System.out.println("Name: Akshara Gupta");
        System.out.println("Roll No: 2401640100125");
        System.out.println("Class: CS 2A (ELITE)\n");

        addEdge("P1", "R1");
        addEdge("R1", "P2");

        convertToWFG();

        for (String node : wfg.keySet()) {
            System.out.println(node + " waits for " + wfg.get(node));
        }
    }
}