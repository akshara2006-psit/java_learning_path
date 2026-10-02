package DP;

import java.util.Arrays;

public class min_cost_climbing_stair {
     int findCost(int[] cost,int[] dp,int n){
        if(n<=1)
        return 0;
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=Math.min(cost[n-2]+findCost(cost,dp,n-2),
        cost[n-1]+findCost(cost,dp,n-1));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return findCost(cost,dp,n);
    }
}
// Min Cost Climbing stair