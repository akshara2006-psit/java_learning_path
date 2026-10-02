package DP;

import java.util.ArrayList;

public class FIB {
     int MOD=1000000007;
    ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=(dp[i-1]+dp[i-2])%MOD;
        }
        for(int num:dp){
            res.add(num);
        }
        return res;
    }
}
// You are given an integer n, return the fibonacci series till the nth(0-based indexing) term. Since the terms can become very large return the terms modulo 109+7