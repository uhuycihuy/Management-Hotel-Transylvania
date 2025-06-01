import java.util.ArrayList;
import java.util.List;

import hotelmanagement.model.Customer;
import hotelmanagement.model.Makanan;

public abstract class AbstractRoom implements Room{
    protected int roomNumber;
    protected Customer customer;
    protected List<Makanan> orderedMakanan;
    protected boolean available;
    protected RoomType type;

    public AbstractRoom(int roomNumber, RoomType type) {
        this.roomNumber = roomNumber;

        this.type = type;
        this.orderedMakanan = new ArrayList<>();
        this.available = true;
    }

    @Override
    public void bookRoom(Customer customer) {
        this.customer = customer;
        this.available = false;
    }

    @Override
    public void checkOut() {
        this.customer = null;
        this.orderedMakanan.clear();
        this.available = true;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void orderMakanan(Makanan makanan) {
        orderedMakanan.add(makanan);
    }

    // Abstract method untuk diimplementasikan subclass
    protected abstract double getBasePrice();
}
