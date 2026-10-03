import java.util.ArrayList;

public class Detect_cycle_in_graph {
    public boolean isCycle(int V, int[][] edges) {

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

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {

            if (!visited[i]) {
                if (dfs(i, -1, adj, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(int node, int parent,
                        ArrayList<ArrayList<Integer>> adj,
                        boolean[] visited) {

        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {

                if (dfs(neighbor, node, adj, visited)) {
                    return true;
                }

            } 

            else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}
// Detect cycle in a undirected graph