public class Sept_9_1 {
 
    static int heapHeight(int n, int arr[]) {
        if (n == 0) return 0; // edge case
        return (int)(Math.floor(Math.log(n) / Math.log(2)));
    }

}
// Height of a heap