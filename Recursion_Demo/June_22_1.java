public class June_22_1 {
    public static int finonaccci(int n){
        if(n==0 || n==1)
            return n;
        return finonaccci(n-1)+finonaccci(n-2);
    }
    public static void main(String[] args) {
        int n=8;
        int fib=finonaccci(n);
        System.out.println("The fibonacci number of n is: "+finonaccci(n));
    }
}
//fibonacci Number