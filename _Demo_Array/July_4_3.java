public class July_4_3 {
    static int maxProduct(int[] arr) {
        // code here
       
        int maxProd = arr[0];
        int minProd = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(arr[i], maxProd * arr[i]);
            minProd = Math.min(arr[i], minProd * arr[i]);

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-2, 6, -3, -10, 0, 2};
        int ans=maxProduct(arr);
        System.out.println(ans);
    }
}
//maximum product subarray
