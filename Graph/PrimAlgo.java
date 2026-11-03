import java.util.PriorityQueue;

public class PrimAlgo {
    public int spanningTree(int V, int[][] edges) {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];

            adj.get(u).add(new int[]{v, w});
            adj.get(v).add(new int[]{u, w});
        }

        boolean[] visited = new boolean[V];
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        pq.add(new int[]{0, 0});

        int sum = 0;

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int weight = curr[0];
            int node = curr[1];

            if (visited[node]) {
                continue;
            }

            visited[node] = true;
            sum += weight;

            for (int[] neighbor : adj.get(node)) {
                int next = neighbor[0];
                int wt = neighbor[1];

                if (!visited[next]) {
                    pq.add(new int[]{wt, next});
                }
            }
        }

        return sum;
    }
}
