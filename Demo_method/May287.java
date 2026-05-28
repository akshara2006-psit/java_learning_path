public class May287 {
    static int updatevalue(int x){
        x=x*89;
        return x;
    }
    public static void main(String[] args) {
        int x=5;
        int result=updatevalue(x);
        // x=result;
        System.out.println(result);
        System.out.println(x);
    }
}
