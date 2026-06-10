public class June_10_3 {
    static int upperbound(int[] arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]<=target){
              
                l=mid+1;
            }
            else{
                ans=mid;
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,30,30,30,30,40,50};
        int target=35;
        int ind=upperbound(arr, target);
        System.out.println("ans: "+ind);
    }
}
//upper bound
