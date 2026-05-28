public class May284 {
    static int getMaximum(int a,int b){
        if(a>b)
            return a;
        return b;
    }
    public static void main(String[] args) {
        int max_no=getMaximum(90, 78);
        System.out.println("The maximum number is: "+max_no);
    }
}
