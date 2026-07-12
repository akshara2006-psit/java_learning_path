public class July_9_2 {

    static boolean solve(int[] nums,int index){
        if(index==nums.length-1)
        return true;
        if(index>=nums.length)
        return false;
        if(nums[index]==0)
        return false;
        int jumpvalue=nums[index];
        boolean overallAns=false;
        for(int jump=1;jump<=jumpvalue;jump++){
boolean recans=solve(nums,index+jump);
overallAns=overallAns || recans;
        }
        return overallAns;
    }
    public static boolean canJump(int[] nums) {
        int index=0;
        boolean ans=solve(nums,index);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        if(canJump(nums)){
            System.out.println("Yes we can reach the last index");
        }
        else{
            System.out.println("WE can not reach the last index");
        }
    }
}
//Jump Game