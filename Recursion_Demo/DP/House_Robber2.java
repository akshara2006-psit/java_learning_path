package DP;

import java.util.Arrays;

public class House_Robber2 {
     public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Case 1: exclude last house
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = solve(nums, 0, n - 2, dp1);

        // Case 2: exclude first house
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = solve(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    private int solve(int[] nums, int i, int end, int[] dp) {

        // Base case
        if (i > end) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        // Take current house
        int take = nums[i] + solve(nums, i + 2, end, dp);

        // Skip current house
        int skip = solve(nums, i + 1, end, dp);

        return dp[i] = Math.max(take, skip);
    }
}
// House Robber 2