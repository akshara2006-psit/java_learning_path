import java.util.Arrays;
import java.util.Stack;

public class Direct_acyclic_graph_shortest_path {
    public ArrayList<Integer> shortestPath(int V, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] e : edges) {
            adj.get(e[0]).add(new int[]{e[1], e[2]});
        }

        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        while (!st.isEmpty()) {
            int u = st.pop();

            if (dist[u] == Integer.MAX_VALUE) {
                continue;
            }

            for (int[] edge : adj.get(u)) {
                int v = edge[0];
                int wt = edge[1];

                if (dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int d : dist) {
            ans.add(d == Integer.MAX_VALUE ? -1 : d);
        }

        return ans;
    }

    private void dfs(int u, ArrayList<ArrayList<int[]>> adj,
                     boolean[] visited, Stack<Integer> st) {
        visited[u] = true;

        for (int[] edge : adj.get(u)) {
            int v = edge[0];

            if (!visited[v]) {
                dfs(v, adj, visited, st);
            }
        }

        st.push(u);
    }
}
