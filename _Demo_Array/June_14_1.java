public class June_14_1 {
    private static int minTime(int[] boards,int k){
        int n=boards.length;
        if(k>n){
            System.out.println("the partition could not be done");
            return -1;
        }
        int sum=0;
        for(int num:boards){
            sum=sum+num;
        }
        int l=1;
        int r=sum;
        int ans=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isValid(boards,k,mid)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;


            }
        }
        return ans;

    }
    static boolean isValid(int[] boards,int k,int mid){
        int painters=1;
        int sum=0;
        for(int num:boards){
            if(sum+num<=mid){
                sum=sum+num;
            }
            else{
                painters++;
                if(painters>k)
                    return false;
                if(num>mid){
                    return false;
                }
                sum=0;
                sum=sum+num;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={5,10,30,20,15};
        int k=3;
        int ans=minTime(arr, k);
        System.out.println("ans: "+ans);
    }
}
//Painter's partition problem