public class July_5_1 {
    public static int coinsChange(int[] coins,int amount){
        int ans=solve(coins,amount);
        if(ans==Integer.MAX_VALUE)
            return -1;
        else
        return ans;
    }
    public static int solve(int[] coins,int amount){
        if(amount==0){
            return 0;
        }
        if(amount<0)
            return Integer.MAX_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int coin:coins){
            int RecursionKaAns=solve(coins, amount-coin);
            if(RecursionKaAns==Integer.MAX_VALUE){
                continue;
            }else{
                int totalcoinsUsed=RecursionKaAns+1;
                mini=Math.min(mini, totalcoinsUsed);

            }
            
        }
        return mini;
    }
    public static void main(String[] args) {
        int[] coins={1,2,5};
        int amount=6;
        int ans=coinsChange(coins, amount);
        System.out.println(ans);
    }
}
// find the minium no of coins required to make the required amount
//coin-change