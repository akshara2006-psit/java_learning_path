public class July_7_2 {
      public static  void reverseInGroups(int[] arr, int k) {
        // code here
        
        int n = arr.length;

        for (int i = 0; i < n; i += k) {

            int left = i;
            int right = Math.min(i + k - 1, n - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;
reverseInGroups(arr, k);

    }
}
//reverse array in groups