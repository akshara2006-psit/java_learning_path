public class June_30_2{
public static int houseRob(int[] nums){
    int index=0;
    return solve(nums,index);
}
public static int solve(int[] nums,int index){
int n=nums.length;
if(index>=n){
    return 0;
}
int include=nums[index]+solve(nums, index+2);
int exclude=0+solve(nums,index+1);
int ans=Math.max(include,exclude);
return ans;
}
public static void main(String[] args) {
    int[] arr={1,2,3,1};
    int ans=houseRob(arr);
    System.out.println(ans);
}
}
//House robber