package Practice_Sheet.Classes_and_objects;

public class Program1 {
public static void main(String[] args) {
	Book b=new Book(1,"Programming with C",5);
	Rental r=new Rental(4);
	System.out.println("Total Fine: "+r.calculateFine(b));
}
}
