public class Aug_18_3 {
     private void insert(int[] arr, int n, int key) {
       if (n <= 0) {   
           arr[n] = key;
           return;
       }
       if (arr[n - 1] <= key) {  
           arr[n] = key;
           return;
       }
       int temp = arr[n - 1];
       insert(arr, n - 1, key);
       arr[n] = temp;
   }

    void sortArr(int[] arr) {
        sortRec(arr, arr.length);
    }

    private void sortRec(int[] arr, int n) {
        if (n <= 1) return;
        int last = arr[n - 1];
        sortRec(arr, n - 1);
        insert(arr, n - 1, last);
    }
}
// sort a array using recursion