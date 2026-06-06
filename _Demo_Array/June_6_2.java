public class June_6_2{
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            maxi=Math.max(maxi,sum);
            if(sum<0)
                sum=0;
        }
        System.out.println("The maximum sum of subarray is: "+maxi);
    }
}
//Kadane's Algorithm-Maximum sum subarray