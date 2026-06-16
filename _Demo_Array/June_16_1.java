public class June_16_1 {
    public static int unboundedsearch(int[] arr,int target){
        if(arr[0]==target)
            return 0;
        int i=1;
        while(arr[i]<=target){
            i=i*2;
        }
        int l=0,r=0;
        if(arr[i]>target){
            r=i;
            l=i/2;
        }
        
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                r=mid-1;
            }
            else
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
        int target=90;
        int ans=unboundedsearch(arr, target);
        System.out.println("ans: "+ans);

    }
}
//unbounded search