public class May286 {
    static void display(int num){
        System.out.println("The number in parameter is "+num);
    }
    static void display(String name){
        System.out.println("The string in parameter is "+name);
    }
    public static void main(String[] args) {
        int num=78;
        String name="Pari";
        display(name);
        display(num);
    }
}
