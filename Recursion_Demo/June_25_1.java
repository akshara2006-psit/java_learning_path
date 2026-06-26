public class June_25_1 {
    public static void printmyname(int n){
        if(n==0)
            return;
        System.out.println("Akshara Gupta");
        printmyname(n-1);
    }
    public static void main(String[] args) {
        printmyname(10);
    }
}
//print your name 10 times