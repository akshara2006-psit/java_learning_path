public class June_25_2 {
    public static void printNumbers(int n){
        if(n==0)
            return;
        printNumbers(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=5;
        printNumbers(n);
    }
}
// print numbers from 1 to n