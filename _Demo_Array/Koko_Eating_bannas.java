
    
public class Koko_Eating_bannas {
    public int kokoEat(int[] arr, int k) {

        int low = 1;
        int high = 0;
        for (int pile : arr) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;
            for (int pile : arr) {
                hours += (pile + mid - 1) / mid;
            }

            if (hours <= k) {
                ans = mid;
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
