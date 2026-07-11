public class July_6_1 {
     public static boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum=sum+num;
        }
        int index=0;
        int target=sum/2;
        if(sum%2!=0)
        return false;
        boolean ans=solve(target,nums,index);
        return ans;
    }
    static boolean solve(int target,int[] nums,int index){
        if(target==0)
        return true;
        if(target<0){
            return false;
        }
        if(index>=nums.length)
        return false;
        boolean include=solve(target-nums[index],nums,index+1);
        boolean exclude=solve(target,nums,index+1);
        return include || exclude;
    }
    public static void main(String[] args) {
        int[] nums={1,5,11,5};
        if(canPartition(nums)){
            System.out.println("Yes the two subsets can be formed");
        }
        else{
            System.out.println("No the partition can not be done");
        }
    }
}
