import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class July_17_1 {
   
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = q.poll();
                level.add(node.data);

                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            if (!leftToRight) {
                Collections.reverse(level);
            }
            result.addAll(level);

            leftToRight = !leftToRight; // flip direction
        }

        return result;
    }
}

