package Practice.classes_and_object_Plan;

public class Main {
public static void main(String[] args) {
	Plan p=new Plan("Premium",60);
	Subscription s=new Subscription(6);
	double total=s.calculateTotal(p);
	System.out.println("The total cost in dollar of "+p.planName+" for a"+s.durationMonths+" months with a monthlyfee is "+p.monthlyFee+" and 25 signup fee is "+total);
}
}
