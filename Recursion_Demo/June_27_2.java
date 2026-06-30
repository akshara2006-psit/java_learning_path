public class June_27_2 {
    private static  int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]>target){
            end=mid-1;
        }
        if(arr[mid]<target){
            start=mid+1;
        }
        return binarySearch(arr, target, start, end);
    }
    public static void main(String[] args) {
        int[] arr={-1,0,5,6,9,12};
        int n=arr.length;
        int target=9;
        int ans=binarySearch(arr, target, 0, n-1);
        if(ans==-1){
            System.out.println("The taregr us not present in the array");
        }
        else{
            System.out.println("The target is present in the array and the index is: "+ans);
        }
    }
}
//recursive binary search