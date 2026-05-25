package Practice_Sheet.Classes_and_objects;

public class Subscription {
	int durationMonths;
    static final double SIGNUP_FEE = 500;

    Subscription(int durationMonths) {
        this.durationMonths = durationMonths;
    }

    double calculateTotal(Plan plan) {
        return (durationMonths * plan.monthlyFee) + SIGNUP_FEE;
    }
}
