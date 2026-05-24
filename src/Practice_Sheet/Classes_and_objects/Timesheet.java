package Practice_Sheet.Classes_and_objects;

public class Timesheet {
	int hoursWorked;

    Timesheet(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary(Employee emp) {
        return hoursWorked * emp.hourlyRate;
    }
}
