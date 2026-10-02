package DP;
import java.util.Arrays;

public class MIN_OP_TO_REACH_N {
     int[] dp;

    int solve(int n) {

        if (n == 0) {
            return 0;
        }

        if (dp[n] != -1) {
            return dp[n];
        }

        if (n % 2 == 0) {
            // Double operation
            dp[n] = solve(n / 2) + 1;
        } else {
            // Add 1 operation
            dp[n] = solve(n - 1) + 1;
        }

        return dp[n];
    }

    public int minOperation(int n) {

        dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(n);
    }
}
// Given a number n. Find the minimum number of operations required to reach n starting from 0.

// You have two operations available:

// Double the number
// Add one to the number