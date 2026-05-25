class Calculator{
    int a;
    public int add(int num1,int num2){
        System.out.println("in add");
        return num1+num2 ;
    }
}

public class Demo{
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        // int result=num1+num2;
        Calculator obj=new Calculator();
        int result=obj.add(4,5);
        System.out.println(result);
    }
}