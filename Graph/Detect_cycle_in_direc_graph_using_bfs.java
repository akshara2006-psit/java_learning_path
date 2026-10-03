import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Detect_cycle_in_direc_graph_using_bfs {
   
    public boolean isCyclic(int V, int[][] edges) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[V];

        // Build graph + calculate indegree
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        // Add vertices having indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        int count = 0;

        // BFS
        while (!q.isEmpty()) {

            int u = q.remove();
            count++;

            for (int v : adj.get(u)) {

                indegree[v]--;

                if (indegree[v] == 0) {
                    q.add(v);
                }
            }
        }

        // If all vertices processed → no cycle
        // Otherwise → cycle exists
        return count != V;
    } 
}
