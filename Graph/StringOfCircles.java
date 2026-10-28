public class StringOfCircles{
     public boolean isCircle(String[] arr) {
        int n = arr.length;

        int[] in = new int[26];
        int[] out = new int[26];
        boolean[][] graph = new boolean[26][26];

        for (String s : arr) {
            int u = s.charAt(0) - 'a';
            int v = s.charAt(s.length() - 1) - 'a';

            out[u]++;
            in[v]++;
            graph[u][v] = true;
        }

        // Condition 1: In-degree must equal out-degree
        for (int i = 0; i < 26; i++) {
            if (in[i] != out[i]) {
                return false;
            }
        }

        // Find a vertex that has an outgoing edge
        int start = -1;
        for (int i = 0; i < 26; i++) {
            if (out[i] > 0) {
                start = i;
                break;
            }
        }

        // Condition 2: All vertices with edges must be connected
        boolean[] visited = new boolean[26];
        dfs(start, graph, visited);

        for (int i = 0; i < 26; i++) {
            if (out[i] > 0 && !visited[i]) {
                return false;
            }
        }

        return true;
    }

    private void dfs(int u, boolean[][] graph, boolean[] visited) {
        visited[u] = true;

        for (int v = 0; v < 26; v++) {
            if (graph[u][v] && !visited[v]) {
                dfs(v, graph, visited);
            }
        }
    }
}