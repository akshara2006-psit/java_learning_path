package Practice_Sheet.Classes_and_objects;

public class TableOrder {
int quantity;
TableOrder(int quantity){
	this.quantity=quantity;
}
void totalBill(MenuItem m) {
	int service_charge=16;
	int t=m.price*this.quantity;
	System.out.println("The total bill after applying a service charge is"+t);
}
}
