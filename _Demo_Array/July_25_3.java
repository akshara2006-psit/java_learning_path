import java.util.PriorityQueue;

public class July_25_3 {
      public void nearlySorted(int[] arr, int k) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int index = 0;
        for (int i = 0; i <= k && i < arr.length; i++) {
            pq.offer(arr[i]);
        }
        for (int i = k + 1; i < arr.length; i++) {
            arr[index++] = pq.poll();
            pq.offer(arr[i]);
        }
        while (!pq.isEmpty()) {
            arr[index++] = pq.poll();
        }
    }
}
//nearly sorted