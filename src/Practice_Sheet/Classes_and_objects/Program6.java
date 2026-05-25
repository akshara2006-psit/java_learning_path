package Practice_Sheet.Classes_and_objects;

public class Program6 {
public static void main(String[] args) {
	Vehicle v = new Vehicle("Car", 15);
    Trip t = new Trip(10);

    System.out.println("Trip Cost: " + t.calculateFare(v));
}
}
