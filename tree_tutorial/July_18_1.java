import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class July_18_1 {
    static class Pair {
        Node node;
        int hd;
        Pair(Node n, int h) {
            node = n;
            hd = h;
        }
    }

    public ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            Node node = p.node;
            int hd = p.hd;
            if (!map.containsKey(hd)) {
                map.put(hd, node.data);
            }

            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }
        result.addAll(map.values());
        return result;
}
}