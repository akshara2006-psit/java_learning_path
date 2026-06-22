public class June_21_2 {
    public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=8;
        int fact=factorial(n);
        System.out.println("The factorial of n is: "+fact);
    }
}
//factorial using reccursion