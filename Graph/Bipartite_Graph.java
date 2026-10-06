import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Graph {
    public boolean isBipartite(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] color = new int[V];
        Arrays.fill(color, -1);
        for (int i = 0; i < V; i++) {

            if (color[i] != -1) {
                continue;
            }

            Queue<Integer> q = new LinkedList<>();

            q.add(i);
            color[i] = 0;

            while (!q.isEmpty()) {

                int node = q.poll();

                for (int neighbor : adj.get(node)) {
                    if (color[neighbor] == -1) {

                        color[neighbor] = 1 - color[node];

                        q.add(neighbor);
                    }

                   
                    else if (color[neighbor] == color[node]) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
