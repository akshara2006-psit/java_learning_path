import java.util.ArrayList;

public class June_30_3 {
   
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                ans.add(start + 1); // 1-based index
                ans.add(end + 1);
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,7,5};
        int target=12;
        System.out.println(subarraySum(arr, target));
    }

}
//indexes of subarray sum