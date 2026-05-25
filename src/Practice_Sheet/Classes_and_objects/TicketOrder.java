package Practice_Sheet.Classes_and_objects;

public class TicketOrder {
int numberOfSeats;
TicketOrder(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
}
double calculateTotal(Movie movie) {
    double total = numberOfSeats * movie.ticketPrice;
    double tax = total * 0.05; 
    return total + tax;
}
}
