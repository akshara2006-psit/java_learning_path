public class July_1_2 {
    static int maxSubarraySum(int[] arr) {
        // Code here
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum>maxi)
            maxi=sum;
            if(sum<0)
            sum=0;
            
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        int ans=maxSubarraySum(arr);
        System.out.println(ans);
    }
}
//Kadane's Algorithm