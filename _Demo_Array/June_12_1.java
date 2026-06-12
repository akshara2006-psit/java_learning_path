public class June_12_1 {
    private static int getsqrt(int n){
        int l=0;
        int r=n-1;
        int ans=-1;
        if(n==0 || n==1)
            return n;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid<=n){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=56;
        int ans=getsqrt(n);
        System.out.println("sqroot "+ans);
    }
}
//binarysearch-find the sqroot of aa number