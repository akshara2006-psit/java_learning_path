import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstras_{
    public ArrayList<Integer> dijkstra(int V, int[][] edges, int src) {
        ArrayList<int[]>[] adj = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];
            adj[u].add(new int[]{v, w});
            adj[v].add(new int[]{u, w});
        }

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );

        pq.offer(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int d = curr[0];
            int node = curr[1];

            if (d != dist[node]) continue;

            for (int[] next : adj[node]) {
                int v = next[0];
                int w = next[1];

                if (d + w < dist[v]) {
                    dist[v] = d + w;
                    pq.offer(new int[]{dist[v], v});
                }
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int d : dist) {
            ans.add(d);
        }

        return ans;
    }
}