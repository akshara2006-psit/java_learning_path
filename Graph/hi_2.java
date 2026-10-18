import java.util.Arrays;
import java.util.PriorityQueue;

public  class Dijkstra_algo{

    static class Pair {
        int node;
        int dist;

        Pair(int node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    public int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src) {

        PriorityQueue<Pair> pq =
            new PriorityQueue<>((a, b) -> a.dist - b.dist);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        dist[src] = 0;
        pq.offer(new Pair(src, 0));

        while (!pq.isEmpty()) {

            Pair curr = pq.poll();
            int u = curr.node;
            int d = curr.dist;

            if (d > dist[u]) continue;

            for (ArrayList<Integer> edge : adj.get(u)) {

                int v = edge.get(0);
                int wt = edge.get(1);

                if (dist[u] + wt < dist[v]) {

                    dist[v] = dist[u] + wt;
                    pq.offer(new Pair(v, dist[v]));
                }
            }
        }

        return dist;
    }
}