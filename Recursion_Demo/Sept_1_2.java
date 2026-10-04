public class Sept_1_2 {
    public static int countDigits(int n) {
        // Code here
       if (n == 0) return 1;   
       if (n < 10) return 1;   

       // recursive step
       return 1 + countDigits(n / 10);
        
    }
}
// Count Digits in a Number