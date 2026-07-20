import java.util.Arrays;

public class July_9_2 {
    static int[][] dp;

    public static int count(int coins[], int sum) {

        dp = new int[coins.length][sum + 1];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(coins, sum, 0);
    }

    private static int solve(int[] coins, int sum, int index) {

        if (sum == 0)
            return 1;

        if (index == coins.length)
            return 0;

        if (dp[index][sum] != -1)
            return dp[index][sum];

        int include = 0;

        if (coins[index] <= sum) {
            include = solve(coins, sum - coins[index], index);
        }

        int exclude = solve(coins, sum, index + 1);

        return dp[index][sum] = include + exclude;
    }
    public static void main(String[] args) {
        int[] coins={1,2,3};
        int sum=4;
        int ans=count(coins, sum);
        System.out.println(ans);
    }
}
// Given an integer array coins[ ] representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ]. 
