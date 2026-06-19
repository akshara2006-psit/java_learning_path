public class June_18_1 {
    public static  int maxSawHeight(int[] trees,int m){
        int n=trees.length;
        int l=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,trees[i]);
        }
        int r=maxi;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValid(trees,m,mid)){
                ans=mid;
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return ans;
    }
    private static boolean isValid(int[] trees,int m,int mid){
        int sum=0;
        for(int i=0;i<trees.length;i++){
            if(trees[i]>mid){
                sum=sum+trees[i]-mid;
            }
            else{
                sum=sum+0;
            }
        }
        return sum>=m;
    }
    public static void main(String[] args) {
        int[] trees={20,15,10,17};
        int m=7;
        int ans=maxSawHeight(trees, m);
        System.out.println("ans: "+ans);

    }
}
//given an array trees where each element represents the height of a tree and an integer m which represents the required amount of wood you need to collect,your task is to determine the maximum possible height m at which you can set your sawbiade so that when u cut the trees at this height you obtain at least m units of wood