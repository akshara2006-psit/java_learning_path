import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
     public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        int V = adj.size();  
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[0] = true;
        q.add(0);
        while (!q.isEmpty()) {
            int node = q.poll();
            bfs.add(node);
            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }

        return bfs;
    }
}
// BFS TRAVERSAL OF A GRAPH