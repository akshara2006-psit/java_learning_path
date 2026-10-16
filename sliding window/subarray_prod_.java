public class subarray_prod_{
    public int countSubarray(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0;
        int prod = 1;
        int count = 0;
        while (j < n) {
            prod *= arr[j];

            while (i <= j && prod >= k) {
                prod /= arr[i];
                i++;
            }
            count += (j - i + 1);
            j++;
        }
        return count;
    }
}
// Subarrays Product less than K