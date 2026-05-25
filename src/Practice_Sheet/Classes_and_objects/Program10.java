package Practice_Sheet.Classes_and_objects;

public class Program10 {
public static void main(String[] args) {
	Car c=new Car("VXI",167.8);
	RentalAgreement ra=new RentalAgreement(30);
	double ta=ra.calculateTotal(c);
	System.out.println("the total amount for "+ra.rentalDays+" is "+ta);
	
}
}
