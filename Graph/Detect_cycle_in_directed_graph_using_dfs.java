import java.util.ArrayList;

public class Detect_cycle_in_directed_graph_using_dfs {
    public boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }

        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, adj, visited, pathVisited)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(int u,
                       ArrayList<ArrayList<Integer>> adj,
                       boolean[] visited,
                       boolean[] pathVisited) {

        visited[u] = true;
        pathVisited[u] = true;

        for (int v : adj.get(u)) {
            if (pathVisited[v]) {
                return true;
            }
            if (!visited[v]) {
                if (dfs(v, adj, visited, pathVisited)) {
                    return true;
                }
            }
        }
        pathVisited[u] = false;

        return false;
    }
}
