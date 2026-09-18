public class smallest_subarray_sum_greater_than_x{
     public static int smallestSubWithSum(int x, int[] arr) {
        // code here
        int i=0,j=0;
        int sum=0;
        int mini=Integer.MAX_VALUE;
        while(j<arr.length){
            sum=sum+arr[j];
            while(sum>x){
                mini=Math.min(mini,j-i+1);
                sum=sum-arr[i];
                i++;
            }
            j++;
        }
        if(mini==Integer.MAX_VALUE)
        return 0;
        return mini;
    }
}
// smallest subarray sum greater than x