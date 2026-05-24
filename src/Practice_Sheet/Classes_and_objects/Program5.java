package Practice_Sheet.Classes_and_objects;

public class Program5 {
public static void main(String[] args) {
	Connection c = new Connection(101, "Akshara");
    Bill b = new Bill(150);

    System.out.println("Total Bill: " + b.calculateBill());
}
}
