public class June_11_3 {
    static int findpivotindex(int[] arr){
        int n=arr.length;
        int l=0;
        int r=n-1;
        int ans=-1;
        if(arr[l] <= arr[r])
            return -1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if (arr[mid] >= arr[n - 1]) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int ans=findpivotindex(arr);
        System.out.println(ans);
    }
}
//find the pivot index in rotated sorted array