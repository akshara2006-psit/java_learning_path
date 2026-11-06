public class Sept_2_3{
    int sum=0;
    private int solve(int n){
        if(n==0){
            return 0;
        }
        sum=sum+n;
        return solve(n-1);
    }
    public int recursiveSum(int n) {
        // code here
        solve(n);
        return sum;
    }
}
// Recursively Sum n Numbers
