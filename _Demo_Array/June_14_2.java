import java.util.Arrays;

public class June_14_2 {
    private static int aggressiveCows(int[] stalls,int k){
        Arrays.sort(stalls);
        int n=stalls.length;
        int l=0;
        int r=stalls[n-1]-stalls[0];
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValid(stalls,k,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                    r=mid-1;
            }
        }
        return ans;
    }
    static boolean isValid(int[] stalls,int k,int mid){
        int cowCount=1;
        int lastPosition=0;
        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-stalls[lastPosition]>=mid){
                cowCount++;
                lastPosition=i;
                if(cowCount==k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={1,4,8,2,9};
        int k=3;
        int ans=aggressiveCows(arr, k);
        System.out.println("ans: "+ans);
    }
}
//Aggressive Cows