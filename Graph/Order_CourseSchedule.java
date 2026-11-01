import java.util.LinkedList;
import java.util.Queue;

public class Order_CourseSchedule {
    public ArrayList<Integer> findOrder(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int[] indegree = new int[n];
        for (int[] pre : prerequisites) {
            int x = pre[0];
            int y = pre[1];

            adj.get(y).add(x);
            indegree[x]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        ArrayList<Integer> order = new ArrayList<>();

        while (!q.isEmpty()) {
            int task = q.poll();
            order.add(task);

            for (int next : adj.get(task)) {
                indegree[next]--;

                if (indegree[next] == 0) {
                    q.offer(next);
                }
            }
        }
        if (order.size() != n) {
            return new ArrayList<>();
        }

        return order;
    }
}
