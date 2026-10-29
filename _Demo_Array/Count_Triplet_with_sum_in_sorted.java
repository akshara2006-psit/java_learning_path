public class Count_Triplet_with_sum_in_sorted {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count=0;
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
                int sum = arr[i] + arr[l] + arr[r];

               if (sum < target) {
                   l++;
               } 
               else if (sum > target) {
                   r--;
               } 
               else {
                   if (arr[l] == arr[r]) {
                       int m = r - l + 1;
                       count += m * (m - 1) / 2;
                       break;
                   }

                   int left = 1;
                   int right = 1;

                   while (l + 1 < r && arr[l] == arr[l + 1]) {
                       left++;
                       l++;
                   }

                   while (r - 1 > l && arr[r] == arr[r - 1]) {
                       right++;
                       r--;
                   }

                   count += left * right;
                   l++;
                   r--;
               }
            }
        }
        return count;
    }
}
