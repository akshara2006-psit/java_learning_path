public class June_3_4 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int n = arr.length;

        int i = 0;
        int j = n - 1;
        int k = 0;

        int[] result = new int[n];

        while(i <= j) {

            if(i == j) {
                result[k++] = arr[i];
                i++;
                j--;
            }
            else {
                result[k++] = arr[i];
                result[k++] = arr[j];
                i++;
                j--;
            }
        }

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}