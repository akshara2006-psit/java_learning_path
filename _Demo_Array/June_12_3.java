//Book Allocation Problem
public class June_12_3 {

    static boolean isValidAnswer(int arr[],int k,int mid){
        int studentCount=1;
        int pages=0;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=mid){
                pages=pages+arr[i];
            }
            else{
                studentCount++;
                if(studentCount>k){
                    return false;
                }
                if(arr[i]>mid){
                    return false;
                }
                else{
                    pages=0;
                    pages=pages+arr[i];
                }
            }
        }
        return true;
    }
    public static int findPages(int[] nums, int m) {
   int n=nums.length;
   int l=1;
   int sum=0;
   if(m>n)
   return -1;
   for(int num:nums){
    sum=sum+num;
   }
   int r=sum;
   int ans=-1;
   while(l<=r){
    int mid=l+(r-l)/2;
    if(isValidAnswer(nums,m,mid)){
        ans=mid;
        r=mid-1;
    }
    else{
        l=mid+1;
    }
   }
   return ans;
    }
    public static void main(String[] args) {
        int[] nums={10,20,30,40,50};
        int k=2;
        int ans=findPages(nums,k);
        System.out.println("ans: "+ans);
    }
}