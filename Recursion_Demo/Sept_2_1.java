public class Sept_2_1 {
    int count = 0;

    public int countArrangement(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        permute(arr, 0);

        return count;
    }

    void permute(int[] arr, int index) {
        if (index == arr.length) {
            count++;
            return;
        }

        int position = index + 1;

        for (int i = index; i < arr.length; i++) {
            int value = arr[i];
            if (value % position != 0 &&
                position % value != 0) {
                continue;
            }
            swap(arr, index, i);
            permute(arr, index + 1);
            swap(arr, index, i);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
// 526. Beautiful Arrangement