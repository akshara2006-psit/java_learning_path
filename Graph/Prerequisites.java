import java.util.*;
    
public class Prerequisites {
    public boolean prerequisiteTasks(int n, int[][] prerequisites) {
        // code here
         ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[n];

        // [a, b] means b must be completed before a
        for (int[] pair : prerequisites) {
            int a = pair[0];
            int b = pair[1];

            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();

        // Add tasks with no prerequisites
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        int completed = 0;

        while (!q.isEmpty()) {
            int task = q.poll();
            completed++;

            for (int next : adj.get(task)) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }

        return completed == n;
    }
}

