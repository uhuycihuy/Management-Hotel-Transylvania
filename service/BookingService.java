package hotelmanagement.service;

import hotelmanagement.model.Customer;
import hotelmanagement.model.Makanan;

public interface BookingService {
    boolean bookRoom(int roomNumber, Customer customer);

    boolean orderMakanan(int roomNumber, Makanan makanan);

    double checkOut(int roomNumber);

    void printRoomStatus();
}
