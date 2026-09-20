public class max_subarray_sum_limited_by_x{
    public int maxSum(int[] arr, int x) {
        // code here
        int n=arr.length;
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        int i=0,j=0;
        while(j<n){
            sum=sum+arr[j];
           
            while(sum>x)
            {
                sum=sum-arr[i];
                i++;
            }
             if(sum<=x)
            maxSum=Math.max(maxSum,sum);
            j++;
        }
        return maxSum;
    }
}
//  max_subarray_sum_limited_by_x