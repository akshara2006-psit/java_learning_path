import java.io.IOException;

public class Demo_read{
    public static void main(String[] args) throws IOException{
        System.out.println("Enter a number: ");
        int num=System.in.read();
        System.out.println(num); 
    }
}