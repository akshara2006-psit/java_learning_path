import java.util.HashMap;

public class calc_the_length_subarray_with_min_no_of_cols {
    public int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sum--;
            } else {
                sum++;
            }
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLen = Math.max(maxLen, length);
            } 
            else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
// The longest subarray with equal number of cols