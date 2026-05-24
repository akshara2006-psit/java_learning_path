import java.util.Arrays;

public class varags {
    public static void main(String[] args)
    {
        //fun(2,3,5,56,67,89,90);
        multiple(2,3,"akshara","pari","golu");
    }

    static void multiple(int a,int b,String ...v)//multiple type argumrnts can also be given in variable length argument
    {
        System.out.println(a+b);
            System.out.println(Arrays.toString(v));

    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
}
