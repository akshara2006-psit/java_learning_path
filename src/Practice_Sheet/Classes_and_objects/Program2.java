package Practice_Sheet.Classes_and_objects;

public class Program2 {
public static void main(String[] args) {
	Room r=new Room("A.C",101,2000);
	Booking b=new Booking(5);
	System.out.println("Total Cost: "+b.calculateCost(r));
}
}
