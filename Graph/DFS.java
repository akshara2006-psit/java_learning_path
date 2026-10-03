import java.util.ArrayList;

public class DFS {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> dfs = new ArrayList<>();
        int V = adj.size();   
        boolean[] visited = new boolean[V];
        dfsUtil(0, adj, visited, dfs);
        return dfs;
    }
    private void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, adj, visited, dfs);
            }
        }
    }
}
//  DFS TRAVERSAL OF GRAPH