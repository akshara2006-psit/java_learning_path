public class June_17_1 {
      public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean leftDifferent = (mid == 0 || nums[mid] != nums[mid - 1]);
            boolean rightDifferent = (mid == nums.length - 1 || nums[mid] != nums[mid + 1]);

            if (leftDifferent && rightDifferent) {
                return nums[mid];
            }

            if ((mid % 2 == 0 && mid < nums.length - 1 && nums[mid] == nums[mid + 1]) ||
                (mid % 2 == 1 && nums[mid] == nums[mid - 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr={10,10,20,20,30,30,40,40,50,60,60};
        int ans=singleNonDuplicate(arr);
        System.out.println("ans: "+ans);
    }
}

//find single non duplicate element using binary search