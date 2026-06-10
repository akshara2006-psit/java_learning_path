public class June_10_1 {
    static int binarysearch(int[] arr,int target){
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target){
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,2,3,9,10};
        int target=9;
        int value=binarysearch(arr, target);
        if(value==-1){
            System.out.println("The target is not present in the array.");
        }
        else
            System.out.println("The target is present in the array and the index of target in the array is: "+value);
    }
}
//binary search