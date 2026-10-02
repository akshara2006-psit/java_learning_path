package DP;

import java.util.Arrays;

public class House_Robber {
    int robber(int[] nums,int[] dp,int n){
        if(n==0)
        return nums[0];
        if(n<0)
        return 0;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=Math.max(nums[n]+robber(nums,dp,n-2),robber(nums,dp,n-1));
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return robber(nums,dp,n-1);
    }
}
// House Robber