package Practice_Sheet.Classes_and_objects;

public class Program3 {
public static void main(String[] args) {
	 Employee e = new Employee(1, "Akshara", 500);
     Timesheet t = new Timesheet(8);

     System.out.println("Gross Salary: " + t.calculateSalary(e));
}
}
