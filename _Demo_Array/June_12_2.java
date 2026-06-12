public class June_12_2 {
     public static int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (isPossible(nums, threshold, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

   static private boolean  isPossible(int[] nums, int threshold, int divisor) {

        long sum = 0;

        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; 

            if (sum > threshold) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] nums={1,2,5,9};
        int threshold=6;
        int ans=smallestDivisor(nums, threshold);
        System.out.println("ans: "+ans);
    }
}
//find the smallest divor given a range