package DP;

public class COUNT_WAYS_WITH_3_5_10 {
    int[] coins = {3, 5, 10};
    long[][] dp;

    long solve(int n, int index) {
        if (n == 0) {
            return 1;
        }
        if (index == 3 || n < 0) {
            return 0;
        }

        if (dp[index][n] != -1) {
            return dp[index][n];
        }
        long take = solve(n - coins[index], index);
        long skip = solve(n, index + 1);

        return dp[index][n] = take + skip;
    }

    public long countWays(int n) {
        dp = new long[3][n + 1];

        for (int i = 0; i < 3; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(n, 0);
    }
}
