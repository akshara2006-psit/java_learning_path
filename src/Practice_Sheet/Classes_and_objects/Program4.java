package Practice_Sheet.Classes_and_objects;

public class Program4 {
public static void main(String[] args) {
	Plan p = new Plan("Premium", 1500);
    Subscription s = new Subscription(6);

    System.out.println("Total Cost: " + s.calculateTotal(p));
}
}
