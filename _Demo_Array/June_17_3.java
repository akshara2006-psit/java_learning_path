public class June_17_3 {
    public static int findElementinnearlysortedArray(int[] arr,int k){
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==k)
                return mid;
            if((mid-1)>=0 && arr[mid-1]==k)
                return mid-1;
            if((mid+1)<n && arr[mid+1]==k)
                return mid+1;
            if(k>arr[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,5,10,9,13};
        int k=10;
        int ans=findElementinnearlysortedArray(arr, k);
        System.out.println("ans: "+ans);
    }
}
//find an element in a nearly sorted array elements can be swapped with adjacent ones