import java.util.ArrayList;
import java.util.Arrays;

public class Bipartite_Graph_using_dfs {
    class Solution {
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

            if (color[i] == -1) {
                color[i] = 0;

                if (!dfs(i, adj, color)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(int node,
                        ArrayList<ArrayList<Integer>> adj,
                        int[] color) {

        for (int neighbor : adj.get(node)) {
            if (color[neighbor] == -1) {
                color[neighbor] = 1 - color[node];

                if (!dfs(neighbor, adj, color)) {
                    return false;
                }
            }
            else if (color[neighbor] == color[node]) {
                return false;
            }
        }

        return true;
    }
}
}
