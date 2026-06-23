public class June_21_3 {
    public static int powerOfTwo(int n){
        if(n==0)
            return 1;
        return 2*powerOfTwo(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("The power of n is: "+powerOfTwo(n));
    }
}
//power of two