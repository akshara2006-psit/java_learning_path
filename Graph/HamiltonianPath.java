public class HamiltonianPath {
    public boolean check(int n, int m, ArrayList<ArrayList<Integer>> edges) {
        boolean[][] graph = new boolean[n][n];

        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0) - 1;
            int v = edge.get(1) - 1;

            graph[u][v] = true;
            graph[v][u] = true;
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            visited[i] = true;

            if (dfs(i, 1, n, graph, visited)) {
                return true;
            }

            visited[i] = false;
        }

        return false;
    }

    private boolean dfs(int u, int count, int n,
                        boolean[][] graph, boolean[] visited) {
        if (count == n) {
            return true;
        }

        for (int v = 0; v < n; v++) {
            if (graph[u][v] && !visited[v]) {
                visited[v] = true;

                if (dfs(v, count + 1, n, graph, visited)) {
                    return true;
                }

                // Backtrack
                visited[v] = false;
            }
        }

        return false;
    }
}
