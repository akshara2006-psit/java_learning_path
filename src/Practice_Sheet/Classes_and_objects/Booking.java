package Practice_Sheet.Classes_and_objects;

public class Booking {
	int numberOfNights;

    Booking(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    double calculateCost(Room room) {
        return numberOfNights * room.pricePerNight;
    }
}
