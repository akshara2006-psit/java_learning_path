package Practice_Sheet.Classes_and_objects;

public class Rental {
int daysOverdue;
Rental(int daysOverdue){
	this.daysOverdue = daysOverdue;
	
}
double calculateFine(Book book) {
	return daysOverdue*book.dailyFineAmount;
}
}
