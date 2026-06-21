public class June_20_2 {

    public static int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i])) {
                ans = Math.max(ans, nums[i][i]);
            }

            if (isPrime(nums[i][n - i - 1])) {
                ans = Math.max(ans, nums[i][n - i - 1]);
            }
        }

        return ans;
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{5,6,7},{9,10,11}};
        int ans=diagonalPrime(nums);
        System.out.println("The prime in diaggonal is: "+ans);
    }
}
//prie in diagonal