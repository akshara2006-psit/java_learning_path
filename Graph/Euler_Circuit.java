public class Euler_Circuit {
     void dfs(int u, int[][] adj, boolean[] vis) {
        vis[u] = true;

        for (int v : adj[u]) {
            if (!vis[v]) {
                dfs(v, adj, vis);
            }
        }
    }

    public int isEulerCircuit(int V, int[][] adj) {

        int start = -1;

        for (int i = 0; i < V; i++) {
            if (adj[i].length > 0) {
                start = i;
                break;
            }
        }
        if (start == -1) return 2;

        boolean[] vis = new boolean[V];
        dfs(start, adj, vis);
        for (int i = 0; i < V; i++) {
            if (adj[i].length > 0 && !vis[i]) {
                return 0;
            }
        }

        int odd = 0;

        for (int i = 0; i < V; i++) {
            if ((adj[i].length & 1) == 1) {
                odd++;
            }
        }

        if (odd == 0) return 2;
        if (odd == 2) return 1;

        return 0;
    }
}
