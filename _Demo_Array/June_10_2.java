public class June_10_2 {
    static int getlowerbound(int[] arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l/2);
            if(arr[mid]>=target){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,30,30,30,30,40,50};
        int target=35;
        int ind=getlowerbound(arr, target);
        System.out.println("ans: "+ind);
    }
}
//lower bound