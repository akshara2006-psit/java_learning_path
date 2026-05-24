package Practice_Sheet.Classes_and_objects;

public class Trip {
	double distanceKm;

    Trip(double distanceKm) {
        this.distanceKm = distanceKm;
    }

    double calculateFare(Vehicle vehicle) {
        return distanceKm * vehicle.baseFarePerKm;
    }
}
