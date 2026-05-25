package Practice.classes_and_object_Plan;

public class Subscription {
int durationMonths;
Subscription(int durationMonths){
	this.durationMonths=durationMonths;
}
double calculateTotal(Plan p) {
	final double signUpfee=25;
	double total=p.monthlyFee*this.durationMonths+signUpfee;
	return total;
}
}
