public class June_11_1 {
      static int upperbound(int[] arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=n;
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
     static int getlowerbound(int[] arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=n;
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
        int[] arr={1,1,2,2,2,2,3};
        int target=2;
        int lidx=getlowerbound(arr, 2);
        int uidx=upperbound(arr, target);
        int ans=uidx-lidx;
        System.out.println("The total number of occurences is: "+ans);
    }
}
//total number of occurence