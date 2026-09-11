import java.util.ArrayList;
import java.util.PriorityQueue;

public class max_of_subarrys {
    static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[0] - a[0]
        );

        int i = 0, j = 0;
        while (j < arr.length) {
            pq.add(new int[]{arr[j], j});
            if (j - i + 1 < k) {
                j++;
            }
            else {
                while (!pq.isEmpty() && pq.peek()[1] < i) {
                    pq.poll();
                }
                ans.add(pq.peek()[0]);
                i++;
                j++;
            }
        }

        return ans;
    }
}
// maximum of all subarrays