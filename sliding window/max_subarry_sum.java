public class max_subarry_sum{
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i=0,j=0;
        int n=arr.length;
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        while(j<n){
            sum=sum+arr[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                maxsum=Math.max(maxsum,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return maxsum;
    }
}
// maximum sum subarray of size k