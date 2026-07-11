public class July_9_1{
    private static int solve(int sum,int target,int[][] mat,int row){
        if(row >=mat.length)
        return Math.abs(sum-target);
        int mini=Integer.MAX_VALUE;
        for(int num:mat[row]){
            int ans=solve(sum+num,target,mat,row+1);
            mini=Math.min(mini,ans);
        }
        return mini;
    }
    public  static int minimizeTheDifference(int[][] mat, int target) {
        int row=0;
        int sum=0;
        return solve(sum,target,mat,row);
    }
    public static void main(String[] args) {
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int target=13;
        int ans=minimizeTheDifference(mat, target);
        System.out.println(ans);
    }
}


// You are given an m x n integer matrix mat and an integer target.

// Choose one integer from each row in the matrix such that the absolute difference between target and the sum of the chosen elements is minimized.

// Return the minimum absolute difference.