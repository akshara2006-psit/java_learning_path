import java.util.ArrayList;
import java.util.Stack;

public class Topological_sort_dfs {
    public ArrayList<Integer> topoSort(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
        }
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, stack);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();

        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }

        return ans;
    }

    public void dfs(int u, 
                    ArrayList<ArrayList<Integer>> adj,
                    boolean[] visited,
                    Stack<Integer> stack) {

        visited[u] = true;
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                dfs(v, adj, visited, stack);
            }
        }
        stack.push(u);
    }

}
