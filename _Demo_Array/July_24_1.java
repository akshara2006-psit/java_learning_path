public class July_24_1 {
    public int findExtra(int a[], int b[]) {
        int m = a.length;
        int n = b.length;

        int i = 0;
        while (i < n) {
            if (a[i] != b[i]) {
                return i; 
            }
            i++;
        }
     
        return m - 1;
    }
}
//index of an extra element