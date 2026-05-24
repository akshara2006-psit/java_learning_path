public class method_overloading {
    public static void main(String[] args) {
        fun(67);//FUNC OVERLOADING OCCURS WHEN THERE ARE MANY FUNCTIONS AVAILABLE OF SAME NAME IT CAN BE SOLVED BY ENSURING THAT FUNCTIONS SHOULD HAVE DIFFERENT TYPE ARGUMENT OR DIFFERENT NUMBER OF ARGUMENT
        fun("AKSHARA GUPTA");
        
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String name)
    {
        System.out.println(name);
    }
    
}
