public class Aug_18_2{
    static void printNto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }
    public static void main(String[] args) {
        printNto1((5));
    }
}
// print n to 1