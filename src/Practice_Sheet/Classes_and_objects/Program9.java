package Practice_Sheet.Classes_and_objects;

public class Program9 {
public static void main(String[] args) {
	Flight f=new Flight("Indigo",1580);
	PassengerBooking pb=new PassengerBooking(5);
	pb.total_fare(f);
}
}
