public class July_9_3{
       public static int maxPathSum(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i = 0, j = 0;
        int sumA = 0, sumB = 0, result = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                sumA += a[i++];
            } else if (a[i] > b[j]) {
                sumB += b[j++];
            } else {
      
                result += Math.max(sumA, sumB) + a[i];
                sumA = 0;
                sumB = 0;
                i++;
                j++;
            } 
        }

        while (i < m) sumA += a[i++];
        while (j < n) sumB += b[j++];

        result += Math.max(sumA, sumB);

        return result;
    }
    public static void main(String[] args) {
        int[] a={2,3,7,10,12};
        int[] b={1,5,7,8};
        int ans=maxPathSum(a, b);
        System.out.println(ans);
    }
}
//Max Sum Path in Two Arrays