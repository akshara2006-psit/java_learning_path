public class June_11_2 {
   static int peakIndexmountainArray(int[] arr){
    int n=arr.length;
    int l=0;
    int r=n-1;
    int ans=-1;
    while(l<=r){
        int mid=l+(r-l)/2;
        if(arr[mid]>=arr[mid+1])
        {
            ans=mid;
            r=mid-1;
        }
        else
            l=mid+1;

    }
    return ans;
   } 
   public static void main(String[] args) {
    int[] arr={0,2,5,3,1};
    int value=peakIndexmountainArray(arr);
    System.out.println("ans: "+value);
   }
}
//find peak index in a mountain array