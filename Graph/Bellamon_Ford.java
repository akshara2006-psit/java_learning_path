import java.util.Arrays;

public class Bellamon_Ford {
    public ArrayList<Integer> bellmanFord(int V, int[][] edges, int src) {

        int INF = (int)1e8;
        int[] dist = new int[V];
        Arrays.fill(dist, INF);

        dist[src] = 0;
        for (int i = 1; i <= V - 1; i++) {
            boolean updated = false;

            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];

                if (dist[u] != INF && dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    updated = true;
                }
            }

            if (!updated) break;
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            if (dist[u] != INF && dist[u] + w < dist[v]) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(-1);
                return ans;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int d : dist) {
            ans.add(d);
        }

        return ans;
    }
}