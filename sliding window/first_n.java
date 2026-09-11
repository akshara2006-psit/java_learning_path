import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class first_n{
    static List<Integer> firstNegInt(int arr[], int k) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> neg = new LinkedList<>();

        int i = 0, j = 0;

        while (j < arr.length) {
            if (arr[j] < 0) {
                neg.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            }
            else if (j - i + 1 == k) {
                if (neg.isEmpty()) {
                    res.add(0);
                } else {
                    res.add(neg.peek());
                }
                if (!neg.isEmpty() && arr[i] == neg.peek()) {
                    neg.poll();
                }

                i++;
                j++;
            }
        }

        return res;
    }
}
// first neg no in every window of size k