package Practice_Sheet.Classes_and_objects;

public class Program7 {
public static void main(String[] args) {
	Movie m = new Movie("how are you!!", 250);
    TicketOrder t = new TicketOrder(3);

    System.out.println("Total Bill: " + t.calculateTotal(m));
}
}
