package Practice_Sheet.Classes_and_objects;

public class PassengerBooking {
int numberOfPassengers;
PassengerBooking(int numberOfPassengers){
	this.numberOfPassengers=numberOfPassengers;
}
void total_fare(Flight f) {
	int luggage_fees=300;
	int tf=this.numberOfPassengers*f.seatPrice+luggage_fees;
	System.out.println("The total fare is : "+tf);
}
}
