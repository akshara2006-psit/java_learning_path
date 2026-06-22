public class June_21_1{
    public static void printhello(int n){
        if(n==0)
            return ;
        System.out.println("Hello");
        printhello(n-1);
    }
    public static void main(String[] args) {
        printhello(5);
    }
}
//simple recursion program