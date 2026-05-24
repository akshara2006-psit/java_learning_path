package Practice_Sheet.Classes_and_objects;

public class RentalAgreement {
int rentalDays;
RentalAgreement(int rentalDays){
	this.rentalDays=rentalDays;
}
double calculateTotal(Car c) {
	final double securityAmount=5000;
	double t=this.rentalDays*c.rentalRatePerDay+securityAmount;
	return t;
}
}
