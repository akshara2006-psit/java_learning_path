public class Maximum_package_delivery {
     public long maxPackages(int[] arr, int totalTime) {

        int n = arr.length;

        int k = Math.min(totalTime, n);

        long sum = 0;
        long max = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        max = sum;
        for (int i = k; i < n; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            max = Math.max(max, sum);
        }

        return max;
    }
}
// Maximum package delivery within totaltime