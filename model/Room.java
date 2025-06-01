import hotelmanagement.model.Customer;

public interface Room {
    void bookRoom(Customer customer);
    void checkOut();
    double calculateBill();
    boolean isAvailable();
    void orderMakanan(Makanan makanan);
}
