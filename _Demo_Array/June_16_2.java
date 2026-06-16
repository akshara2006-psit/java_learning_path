public class June_16_2 {
     public static int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;

        int maxRow = -1;
        int maxOnes = 0;

        for (int i = 0; i < n; i++) {
            int firstOne = firstOneIndex(arr[i], m);

            if (firstOne != -1) {
                int ones = m - firstOne;

                if (ones > maxOnes) {
                    maxOnes = ones;
                    maxRow = i;
                }
            }
        }

        return maxRow;
    }

    private static
     int firstOneIndex(int[] row, int m) {
        int low = 0, high = m - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == 1) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[][] arr={{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        int ans=rowWithMax1s(arr);
        System.out.println("ans: "+ans);
    }
}
//row with max no of ones