public class June_22_2{
    public static int climbStairs(int n){
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }
    public static void main(String[] args) {
        int n=5;
        int ans=climbStairs(n);
        System.out.println("The number of the ways to climb the stairs is: "+ans);
    }
}
// You are climbing a staircase. It takes n steps to reach the top.

// Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

 