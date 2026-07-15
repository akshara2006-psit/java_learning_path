import java.util.Arrays;

public class July_7_3 {
      public static boolean hasTripletSum(int arr[], int target) {
        // code Here
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {
                    return true;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int[] arr={1,2,4,3,6,7};
        int target=10;
        if(hasTripletSum(arr, target)){
            System.out.println("has triplet sum");
        }
        else{
            System.out.println("no");
        }
    }
}
//triplet-sum in array