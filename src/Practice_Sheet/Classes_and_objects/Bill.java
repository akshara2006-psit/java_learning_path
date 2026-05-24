package Practice_Sheet.Classes_and_objects;

public class Bill {
int unitsConsumed;
Bill(int unitsConsumed) {
    this.unitsConsumed = unitsConsumed;
}
double calculateBill() {
    double amount = 0;

    if (unitsConsumed <= 100) {
        amount = unitsConsumed * 1.20;
    } else {
        amount = (100 * 1.20) + (unitsConsumed - 100) * 1.50;
    }

    return amount;
}
}
