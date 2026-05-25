package Practice_Sheet.Classes_and_objects;

public class Program8 {
public static void main(String[] args) {
	MenuItem m=new MenuItem("Dosa",80);
	TableOrder o=new TableOrder(2);
	o.totalBill(m);
}
}
