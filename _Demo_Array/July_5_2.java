import java.util.Arrays;

public class July_5_2 {
     public static int findMaxSum(int arr[]) {
        // code here
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return solve(arr, 0, dp);
    }

    public static int solve(int[] arr, int index, int[] dp) {
        if (index >= arr.length)
            return 0;

        if (dp[index] != -1)
            return dp[index];

        int include = arr[index] + solve(arr, index + 2, dp);
        int exclude = solve(arr, index + 1, dp);

        return dp[index] = Math.max(include, exclude);
    }
    public static void main(String[] args) {
        int arr[] = {6, 7, 1, 3, 8, 2, 4};
        int ans=findMaxSum(arr);
        System.out.println(ans);
    }
}
//Stickler the thief wants to loot money from the houses arranged in a line. He cannot loot two consecutive houses and aims to maximize his total loot.
// Given an array, arr[] where arr[i] represents the amount of money in the i-th house. Determine the maximum amount he can loot.